package FactoryPattern;

import FactoryPattern.aws.AWSS3StorageFactory;
import FactoryPattern.azure.AzureBlobStorageFactory;
import FactoryPattern.cloudstorage.CloudStorageFactory;
import FactoryPattern.google.GoogleStorageFactory;

public class Main {
    public static void main(String[] args) {
        // Upload a file to AWS S3
        CloudStorageFactory awsFactory = new AWSS3StorageFactory();
        awsFactory.uploadFile("example.txt", "Hello, AWS S3!".getBytes());

        // Upload a file to Google Cloud Storage
        CloudStorageFactory googleFactory = new GoogleStorageFactory();
        googleFactory.uploadFile("example.txt", "Hello, Google Cloud!".getBytes());

        // Upload a file to Azure Blob Storage
        CloudStorageFactory azureFactory = new AzureBlobStorageFactory();
        azureFactory.uploadFile("example.txt", "Hello, Azure!".getBytes());
    }
}
