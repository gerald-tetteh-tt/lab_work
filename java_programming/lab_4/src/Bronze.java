import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Bronze extends MembershipType {
    public static int minimumPoints = 1;
    public Bronze(int maxTradesPerDay) {
        super(maxTradesPerDay,false);
    }

    public boolean canTrade() {
        LocalTime timeLimit = LocalTime.parse("10:00:00+00:00",
                DateTimeFormatter.ISO_TIME);
        LocalTime currentTime = LocalTime.now();
        return currentTime.isAfter(timeLimit);
    }
}
