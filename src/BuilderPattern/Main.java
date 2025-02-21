package BuilderPattern;

import BuilderPattern.Builder.Computer;
import BuilderPattern.Builder.ComputerDirector;
import BuilderPattern.Builder.GamingComputerBuilder;
import BuilderPattern.Builder.WorkStationComputerBuilder;
import BuilderPattern.Exception.InvalidComputerException;

public class Main {
    public static void main(String[] args) {
        try {
            // Build a Gaming PC
            ComputerDirector gamingDirector = new ComputerDirector(new GamingComputerBuilder());
            gamingDirector.constructComputer();
            Computer gamingPC = gamingDirector.getComputer();
            System.out.println("Gaming PC: " + gamingPC);

            // Build a Workstation PC
            ComputerDirector workstationDirector = new ComputerDirector(new WorkStationComputerBuilder());
            workstationDirector.constructComputer();
            Computer workstationPC = workstationDirector.getComputer();
            System.out.println("Workstation PC: " + workstationPC);
        } catch (InvalidComputerException e) {
            System.err.println("Error building computer: " + e.getMessage());
        }
    }
}
