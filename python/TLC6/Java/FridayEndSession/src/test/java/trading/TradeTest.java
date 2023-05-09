package trading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TradeTest {

    @Test
    public void negativePriceForTradeTest(){
        //arrange
        //given
        double testPrice = -1.0;
        //class under test
        Trade cut = new Bond("t1", "APPL", 10, 1.0, 0.15);

        //act
        //when
        cut.setPrice(testPrice);

        //assert
        //then
        assertEquals(1.0, cut.getPrice());
    }

    //test for the positive value
}
