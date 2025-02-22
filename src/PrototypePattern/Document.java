package PrototypePattern;

public class Document implements Cloneable {
    private String title;
    private String content;
    private String formatting;

    public Document(String title, String content, String formatting) {
        this.title = title;
        this.content = content;
        this.formatting = formatting;
    }
    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFormatting() {
        return formatting;
    }

    public void setFormatting(String formatting) {
        this.formatting = formatting;
    }

    // Override clone method to support Prototype Pattern
    @Override
    public Document clone() {
        try {
            return (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported for Document", e);
        }
    }

    @Override
    public String toString() {
        return "Document [title=" + title + ", content=" + content + ", formatting=" + formatting + "]";
    }
}
