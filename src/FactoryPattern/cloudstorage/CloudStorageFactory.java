package FactoryPattern.cloudstorage;

/**
 * Abstract factory class for creating CloudStorage objects.
 */
public abstract class CloudStorageFactory {
    public abstract CloudStorage createStorage();

    public void uploadFile(String fileName, byte[] fileContent) {
        CloudStorage storage = createStorage();
        storage.uploadFile(fileName, fileContent);
    }

    public byte[] downloadFile(String fileName) {
        CloudStorage storage = createStorage();
        return storage.downloadFile(fileName);
    }
}
