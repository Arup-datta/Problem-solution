package Test;
import java.util.*;

public class Editor {
    Stack < Data > stack = new Stack<Data>(); /// stack to keep track of states

    Document document = new Document();

    public void setDocumentContent(String newContent) {
        String contentBefore = document.getContent();
        document.setContent(newContent); // content modified
        /// push every operation into the stack
        stack.push(new Data("setContent", contentBefore, newContent));
    }

    public void setDocumentFontName(String newFontName) {
        String fontNameBefore = document.getFontName();
        document.setFontName(newFontName); // fontName modified
        stack.push(new Data("setFontName", fontNameBefore, newFontName));
    }

    public void setDocumentFontSize(Integer newFontSize) {
        Integer fontSizeBefore = document.getFontSize();
       // System.out.println("print: ");
        //System.out.println(fontSizeBefore);
        document.setFontSize(newFontSize); /// fontSize modified
        stack.push(new Data("setFontSize", Integer.toString(fontSizeBefore), Integer.toString(newFontSize)));
    }

    public void undo() {
        /// this the most complicated one
        if(stack.empty()) {
            System.out.println("Operation can't be applied!");
            return;
        }

        Data peek = stack.peek();
        /// it contains the operation name, previous value, new value
        String operation = peek.getName();
        String previousValue = peek.getPreviousValue();
        String newValue = peek.getNextValue();

        stack.pop();

        if(operation.equals("setContent")) {
            /// undo content setting
            /// update documents content variable with the previousValue variable
            document.setContent(previousValue);
        }
        else if(operation.equals("setFontName")) {
            /// undo fontName
            document.setFontName(previousValue);
        }
        else if(operation.equals("setFontSize")) {
            /// undo fontSize
            // first I need to convert the variable type to Integer
            document.setFontSize(Integer.parseInt(previousValue));
        }
        /// ADD NEW Conditions if new variables are added
        /// Can use switch case too
        System.out.println("Undo operation is applied!");
    }

    /// to check the current state of the object
    public void currentConfig() {
        System.out.println(document.toString());
    }

}
