package BuilderPattern.Builder;

public class WorkStationComputerBuilder extends ComputerBuilder {
    @Override
    public ComputerBuilder setCPU() {
        this.CPU = "AMD Ryzen Threadripper";
        return this;
    }

    @Override
    public ComputerBuilder setRAM() {
        this.RAM = "64GB DDR4 ECC";
        return this;
    }

    @Override
    public ComputerBuilder setStorage() {
        this.storage = "2TB NVMe SSD";
        return this;
    }

    @Override
    public ComputerBuilder setGPU() {
        this.GPU = "NVIDIA Quadro RTX 6000";
        return this;
    }

    @Override
    public ComputerBuilder setMotherboard() {
        this.motherboard = "ASUS Pro WS WRX80";
        return this;
    }
}
