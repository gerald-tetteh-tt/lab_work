package mocking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.exceptions.base.MockitoException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class SpecialBondTest {

    private SpecialBond specialBond;
    IDividendsCalculator calcMock = mock(IDividendsCalculator.class);

    @BeforeEach
    public void setup(){
        //to use a test stub
        //specialBond = new SpecialBond(new DividendCalcStub());

        specialBond = new SpecialBond("T1", "APPL", 100, 15.25, calcMock);
    }

    @Test
    public void qtyGreaterThanTenTest(){
        //arrange
        specialBond = new SpecialBond("T1", "APPL", 100, 15.25, calcMock);
        //tell the mock what to do
        when(calcMock.getDividends(specialBond)).thenReturn(1.5);

        //act
        double dividend = specialBond.calcDividend();

        //assert
        assertEquals(0.225,dividend, 0.01);
        //verify the interaction with the mock
        verify(calcMock, Mockito.times(1)).getDividends(specialBond);
    }

    @Test
    public void qtyLessThanTenTest(){
        //arrange
        specialBond = new SpecialBond("T1", "APPL", 1, 15.25, calcMock);
        when(calcMock.getDividends(specialBond)).thenReturn(1.5);

        //act
        double dividend = specialBond.calcDividend();

        //assert
        assertEquals(0.2,dividend, 0.01);
        verify(calcMock, Mockito.times(0)).getDividends(specialBond);
    }

}
