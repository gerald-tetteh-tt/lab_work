public class Bronze extends MembershipType {
    public static int minimumPoints = 1;
    public Bronze(int maxTradesPerDay) {
        super(maxTradesPerDay);
    }

    @Override
    public boolean canTrade() {
        return false;
    }
}
