package FactoryPattern.cloudstorage;

public interface CloudStorage {
    void uploadFile(String fileName, byte[] fileContent);
    byte[] downloadFile(String fileName);
}
