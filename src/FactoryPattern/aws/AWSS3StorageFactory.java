package FactoryPattern.aws;

import FactoryPattern.cloudstorage.CloudStorage;
import FactoryPattern.cloudstorage.CloudStorageFactory;

public class AWSS3StorageFactory extends CloudStorageFactory {
    @Override
    public CloudStorage createStorage() {
        return new AWSS3Storage();
    }
}
