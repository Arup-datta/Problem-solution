package Test;
import java.util.*;

public class Document extends DocumentAbstract{

    public Document() {
        this.fontSize = 0;
        this.fontName = "Not set yet";
        this.content = "Not set yet";
    }

    public Document(String content, String fontName, Integer fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    @Override
    void setContent(String content) {
        this.content = content;
    }

    @Override
    void setFontName(String fontName) {
        this.fontName = fontName;
    }

    @Override
    void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    String getFontName() {
        return this.fontName;
    }

    @Override
    String getContent() {
        return this.content;
    }

    @Override
    Integer getFontSize() {
        return this.fontSize;
    }

    @Override
    public String toString() {
        return "Document{" +
                "fontName='" + fontName + '\'' +
                ", content='" + content + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }

    // non-implemented methods are implemented here

}
