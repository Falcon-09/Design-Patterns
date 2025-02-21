package BuilderPattern.Builder;

import BuilderPattern.Exception.InvalidComputerException;

public class ComputerDirector {
    private ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void constructComputer() {
        computerBuilder.setCPU()
                .setRAM()
                .setStorage()
                .setGPU()
                .setMotherboard();
    }

    public Computer getComputer() throws InvalidComputerException {
        return computerBuilder.build();
    }
}
