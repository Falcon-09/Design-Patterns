package FactoryPattern.azure;

import FactoryPattern.cloudstorage.CloudStorage;
import FactoryPattern.cloudstorage.CloudStorageFactory;

public class AzureBlobStorageFactory extends CloudStorageFactory {
    @Override
    public CloudStorage createStorage() {
        return new AzureBlobStorage();
    }
}
