package PrototypePattern.test;

import PrototypePattern.Document;
import PrototypePattern.DocumentRegistry;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DocumentTest {
    @Test
    public void testDocumentClone() {
        Document original = new Document("Original", "Original content...", "Arial, 12pt");
        Document clone = original.clone();

        // Verify that the clone is a separate object
        assertNotSame(original, clone, "Clone should be a separate object.");

        // Verify that the properties are the same
        assertEquals(original.getTitle(), clone.getTitle(), "Title should be the same.");
        assertEquals(original.getContent(), clone.getContent(), "Content should be the same.");
        assertEquals(original.getFormatting(), clone.getFormatting(), "Formatting should be the same.");
    }

    @Test
    public void testDocumentRegistry() {
        Document resume = DocumentRegistry.getPrototype("resume");
        assertEquals("Resume Template", resume.getTitle(), "Resume title should match.");
        assertEquals("Default resume content...", resume.getContent(), "Resume content should match.");
        assertEquals("Arial, 12pt", resume.getFormatting(), "Resume formatting should match.");

        Document report = DocumentRegistry.getPrototype("report");
        assertEquals("Report Template", report.getTitle(), "Report title should match.");
        assertEquals("Default report content...", report.getContent(), "Report content should match.");
        assertEquals("Times New Roman, 11pt", report.getFormatting(), "Report formatting should match.");
    }
}
