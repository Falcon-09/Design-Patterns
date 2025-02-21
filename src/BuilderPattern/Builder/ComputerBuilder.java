package BuilderPattern.Builder;

import BuilderPattern.Exception.InvalidComputerException;

/*
Defines the steps required to build a computer
 */

public abstract class ComputerBuilder {
    protected String CPU;
    protected String RAM;
    protected String storage;
    protected String GPU;
    protected String motherboard; // New field

    public abstract ComputerBuilder setCPU();
    public abstract ComputerBuilder setRAM();
    public abstract ComputerBuilder setStorage();
    public abstract ComputerBuilder setGPU();
    public abstract ComputerBuilder setMotherboard();

    public Computer build() throws InvalidComputerException {
        validate();
        return new Computer(this);
    }

    protected void validate() throws InvalidComputerException {
        if (CPU == null || RAM == null || storage == null) {
            throw new InvalidComputerException("CPU, RAM, and Storage are mandatory fields.");
        }
    }
}
