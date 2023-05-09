package com.vmorg.machine;

import com.vmorg.exceptions.InvalidHostnameException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MachineTest {

    @Test
    void testValidHostName() {
        assertDoesNotThrow(() -> {
            Desktop validMachine = new Desktop(
                    "host20230328005",
                    "gerald-tetteh",
                    2, 2, 12,
                    11, "21H2"
            );
        });
    }

    @Test
    void testInvalidLengthHostName() {
        assertThrows(InvalidHostnameException.class, () -> {
            Desktop validMachine = new Desktop(
                    "host202303280051",
                    "gerald-tetteh",
                    2, 2, 12,
                    11, "21H2"
            );
        });
    }

    @Test
    void testInvalidDateHostName() {
        assertThrows(InvalidHostnameException.class, () -> {
            Machine validMachine = new Desktop(
                    "host20230338005",
                    "gerald-tetteh",
                    2, 2, 12,
                    11, "21H2"
            );
        });
    }

    @Test
    void testInvalidPrefixHostName() {
        assertThrows(InvalidHostnameException.class, () -> {
            Machine validMachine = new Desktop(
                    "hist20230338005",
                    "gerald-tetteh",
                    2, 2, 12,
                    11, "21H2"
            );
        });
    }
}