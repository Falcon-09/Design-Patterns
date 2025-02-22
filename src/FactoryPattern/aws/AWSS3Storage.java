package FactoryPattern.aws;

import FactoryPattern.cloudstorage.CloudStorage;

public class AWSS3Storage implements CloudStorage {
    @Override
    public void uploadFile(String fileName, byte[] fileContent) {
        System.out.println("Uploading file '" + fileName + "' to AWS S3...");
        // Simulate AWS S3 upload logic
    }

    @Override
    public byte[] downloadFile(String fileName) {
        System.out.println("Downloading file '" + fileName + "' from AWS S3...");
        // Simulate AWS S3 download logic
        return new byte[0];
    }
}
