package trading;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import trading.Account;
import trading.Fund;
import trading.Trade;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void addTradeWhenLimitNotReachedTest() throws TooManyTradesException{
        //arrange
        Trade t = new Fund("T1", "APPL", 100, 15.25);
        Account acc = new Account();
        //act
        acc.addTradetoList(t);
        //assert
        assertEquals(1525, acc.getTotalValOfTrades()  );

    }

    @Test
    public void addTradeWhenLimitISReachedTest() throws TooManyTradesException{
        //arrange
        Trade t = new Fund("T1", "APPL", 100, 15.25);
        Account acc = new Account();
        for (int i=0; i<5; i++){
            acc.addTradetoList(t);
        }
        //act
        TooManyTradesException e = Assertions.assertThrows(TooManyTradesException.class, ()->acc.addTradetoList(t));
        //assert
        assertEquals("You have reached your limit!!", e.getMessage());
        //you can also verify the total value of trades

    }
}
