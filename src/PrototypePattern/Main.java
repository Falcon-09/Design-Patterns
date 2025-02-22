package PrototypePattern;

public class Main {
    public static void main(String[] args) {
        // Get a resume template and customize it
        Document resume = DocumentRegistry.getPrototype("resume");
        resume.setContent("John Doe\nSoftware Engineer\n10+ years of experience...");
        System.out.println("Customized Resume: " + resume);

        // Get a report template and customize it
        Document report = DocumentRegistry.getPrototype("report");
        report.setTitle("Monthly Sales Report");
        report.setContent("Sales increased by 20% this month...");
        System.out.println("Customized Report: " + report);

        // Get a letter template and customize it
        Document letter = DocumentRegistry.getPrototype("letter");
        letter.setContent("Dear Sir/Madam,\n\nI am writing to...");
        System.out.println("Customized Letter: " + letter);
    }
}
