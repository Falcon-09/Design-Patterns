package PrototypePattern;

import java.util.HashMap;
import java.util.Map;

public class DocumentRegistry {
    private static final Map<String, Document> prototypes = new HashMap<>();

    static {
        // Pre-populate the registry with some default templates
        prototypes.put("resume", new Document("Resume Template", "Default resume content...", "Arial, 12pt"));
        prototypes.put("report", new Document("Report Template", "Default report content...", "Times New Roman, 11pt"));
        prototypes.put("letter", new Document("Letter Template", "Default letter content...", "Calibri, 11pt"));
    }

    // Get a prototype by type
    public static Document getPrototype(String type) {
        Document prototype = prototypes.get(type);
        if (prototype == null) {
            throw new IllegalArgumentException("Unknown document type: " + type);
        }
        return prototype.clone(); // Return a clone of the prototype
    }

    // Add a new prototype to the registry
    public static void addPrototype(String type, Document document) {
        prototypes.put(type, document);
    }
}
