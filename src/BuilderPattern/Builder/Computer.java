package BuilderPattern.Builder;

public class Computer {
    private final String CPU;
    private final String RAM;
    private final String storage;
    private final String GPU;
    private final String motherboard;

    // Package-private constructor to enforce immutability and encapsulation
    Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
        this.motherboard = builder.motherboard; // Initialize new field
    }

    // Getters
    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return storage;
    }

    public String getGPU() {
        return GPU;
    }

    public String getMotherboard() {
        return motherboard;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage + ", GPU=" + GPU + ", Motherboard=" + motherboard + "]";
    }
}
