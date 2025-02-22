package FactoryPattern.google;

import FactoryPattern.cloudstorage.CloudStorage;
import FactoryPattern.cloudstorage.CloudStorageFactory;

public class GoogleStorageFactory extends CloudStorageFactory {
    @Override
    public CloudStorage createStorage() {
        return new GoogleCloudStorage();
    }
}
