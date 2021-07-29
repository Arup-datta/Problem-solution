package Test;
import java.util.*;

public class Data {
    /// Helper class
    // to keep track on the operations applied on the document

    /// operation name,  previous value of the variable, new value of the variable
    private String name;
    private String previousValue;
    private String nextValue;

    public Data() {}

    public Data(String name, String previousValue, String nextValue) {
      //  System.out.println("Called     " + previousValue);
        this.name = name;
        this.previousValue = previousValue;
      //  System.out.println(previousValue);
        this.nextValue = nextValue;
    }

    /// getter - setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreviousValue() {
        return this.previousValue;
    }

    public void setPreviousValue(String previousValue) {
        this.previousValue = previousValue;
    }

    public String getNextValue() {
        return this.nextValue;
    }

    public void setNextValue(String nextValue) {
        this.nextValue = nextValue;
    }
}
