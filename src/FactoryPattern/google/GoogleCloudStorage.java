package FactoryPattern.google;

import FactoryPattern.cloudstorage.CloudStorage;

public class GoogleCloudStorage implements CloudStorage {
    @Override
    public void uploadFile(String fileName, byte[] fileContent) {
        System.out.println("Uploading file '" + fileName + "' to Google Cloud Storage...");
        // Simulate Google Cloud Storage upload logic
    }

    @Override
    public byte[] downloadFile(String fileName) {
        System.out.println("Downloading file '" + fileName + "' from Google Cloud Storage...");
        // Simulate Google Cloud Storage download logic
        return new byte[0];
    }
}
