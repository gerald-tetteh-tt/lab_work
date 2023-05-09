import org.junit.jupiter.api.Test;
import trading.Account;
import trading.Fund;
import trading.Trade;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void addTradeTest(){
        Trade t = new Fund("T1", "APPL", 100, 15.25);
        Account acc = new Account();
        acc.addTradetoList(t);
        assertEquals(1525, acc.getTotalValOfTrades()  );

    }
}
