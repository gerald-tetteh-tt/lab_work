package io.turntabl.highestValueGroup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class HighestValueGroupTest {
    List<String> stringGroupTest1 = List.of("1", "2","3", "", "40", "400", "", "4");
    HighestValueGroup underTest = new HighestValueGroup();
    @Test
    void highestValueGroup() {
        int actual = underTest.highestValueGroup(stringGroupTest1);
        Assertions.assertEquals(440, actual);
    }
}