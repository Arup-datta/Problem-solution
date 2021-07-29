package Test;
import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        System.out.println("Insert 1 for setting new document content, 2 for setting new document font name, 3 for setting new font, 4 for undo operation, 5 for checking the current state of document, 6 to exit");
        while(true) {
            Scanner sc = new Scanner(System.in);
            int state = sc.nextInt();
            if(state == 1) {
                System.out.println("Enter new content name:");
                sc.nextLine(); /// to skip newline character
                String content = sc.nextLine();
               /// System.out.println("check " + content);
                editor.setDocumentContent(content);
                System.out.println("Operation applied");
            }
            else if(state == 2) {
                System.out.println("Enter new font name:");
                sc.nextLine(); /// to skip newline character
                String fontName = sc.nextLine();
                editor.setDocumentFontName(fontName);
                System.out.println("operation applied");
            }
            else if(state == 3) {
                System.out.println("Enter new font size:");
                Integer fontSize = sc.nextInt();
                editor.setDocumentFontSize(fontSize);
                System.out.println("Operation applied");
            }
            else if(state == 4) {
                editor.undo();
                ///System.out.println("Undo operation is applied");
            }
            else if(state == 5) {
                editor.currentConfig();
            }
            else {
                System.exit(0);
            }
        }
    }
}
