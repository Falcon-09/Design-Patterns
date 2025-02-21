package test.Builder;

import BuilderPattern.Builder.*;
import BuilderPattern.Exception.InvalidComputerException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {
    @Test
    void testGamingComputerBuilder() throws InvalidComputerException {
        ComputerDirector gamingDirector = new ComputerDirector(new GamingComputerBuilder());
        gamingDirector.constructComputer();
        Computer gamingPC = gamingDirector.getComputer();

        assertNotNull(gamingPC);
        assertEquals("Intel Core i9", gamingPC.getCPU());
        assertEquals("32GB DDR5", gamingPC.getRAM());
        assertEquals("1TB SSD", gamingPC.getStorage());
        assertEquals("NVIDIA RTX 4090", gamingPC.getGPU());
        assertEquals("ASUS ROG Maximus", gamingPC.getMotherboard());
    }

    @Test
    void testWorkstationComputerBuilder() throws InvalidComputerException {
        ComputerDirector workstationDirector = new ComputerDirector(new WorkStationComputerBuilder());
        workstationDirector.constructComputer();
        Computer workstationPC = workstationDirector.getComputer();

        assertNotNull(workstationPC);
        assertEquals("AMD Ryzen Threadripper", workstationPC.getCPU());
        assertEquals("64GB DDR4 ECC", workstationPC.getRAM());
        assertEquals("2TB NVMe SSD", workstationPC.getStorage());
        assertEquals("NVIDIA Quadro RTX 6000", workstationPC.getGPU());
        assertEquals("ASUS Pro WS WRX80", workstationPC.getMotherboard());
    }

    @Test
    void testInvalidComputerException() {
        assertThrows(InvalidComputerException.class, () -> {
            // Directly use the builder to create an incomplete Computer object
            ComputerBuilder builder = new GamingComputerBuilder();
            builder.setCPU(); // Only set CPU (missing RAM and Storage)
            builder.build(); // This should throw InvalidComputerException
        });
    }
}
