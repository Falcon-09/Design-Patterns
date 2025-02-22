package FactoryPattern.azure;

import FactoryPattern.cloudstorage.CloudStorage;

public class AzureBlobStorage implements CloudStorage {
    @Override
    public void uploadFile(String fileName, byte[] fileContent) {
        System.out.println("Uploading file '" + fileName + "' to Azure Blob Storage...");
        // Simulate Azure Blob Storage upload logic
    }

    @Override
    public byte[] downloadFile(String fileName) {
        System.out.println("Downloading file '" + fileName + "' from Azure Blob Storage...");
        // Simulate Azure Blob Storage download logic
        return new byte[0];
    }
}
