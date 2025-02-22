package FactoryPattern.test;

import FactoryPattern.aws.AWSS3StorageFactory;
import FactoryPattern.azure.AzureBlobStorageFactory;
import FactoryPattern.cloudstorage.CloudStorage;
import FactoryPattern.cloudstorage.CloudStorageFactory;
import FactoryPattern.google.GoogleStorageFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CloudStorageTest {
    @Test
    void testAWSS3StorageFactory() {
        CloudStorageFactory factory = new AWSS3StorageFactory();
        CloudStorage storage = factory.createStorage();
        assertNotNull(storage, "AWS S3 storage should not be null.");
        storage.uploadFile("test.txt", "Test content".getBytes());
    }

    @Test
    void testGoogleCloudStorageFactory() {
        CloudStorageFactory factory = new GoogleStorageFactory();
        CloudStorage storage = factory.createStorage();
        assertNotNull(storage, "Google Cloud Storage should not be null.");
        storage.uploadFile("test.txt", "Test content".getBytes());
    }

    @Test
    void testAzureBlobStorageFactory() {
        CloudStorageFactory factory = new AzureBlobStorageFactory();
        CloudStorage storage = factory.createStorage();
        assertNotNull(storage, "Azure Blob Storage should not be null.");
        storage.uploadFile("test.txt", "Test content".getBytes());
    }
}
