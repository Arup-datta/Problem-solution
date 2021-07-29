package Test;
import java.util.*;

public abstract class DocumentAbstract {
    // add new properties here
    public String fontName;
    public String content ;
    public Integer fontSize;

    /// non-implemented methods
    abstract void setContent(String content);
    abstract void setFontName(String fontName);
    abstract void setFontSize(Integer fontSize);
    abstract String getFontName();
    abstract String getContent();
    abstract Integer getFontSize();
}
