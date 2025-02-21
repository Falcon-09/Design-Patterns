package BuilderPattern.Builder;

public class GamingComputerBuilder extends ComputerBuilder {
    @Override
    public ComputerBuilder setCPU() {
        this.CPU = "Intel Core i9";
        return this;
    }

    @Override
    public ComputerBuilder setRAM() {
        this.RAM = "32GB DDR5";
        return this;
    }

    @Override
    public ComputerBuilder setStorage() {
        this.storage = "1TB SSD";
        return this;
    }

    @Override
    public ComputerBuilder setGPU() {
        this.GPU = "NVIDIA RTX 4090";
        return this;
    }

    @Override
    public ComputerBuilder setMotherboard() {
        this.motherboard = "ASUS ROG Maximus";
        return this;
    }
}
