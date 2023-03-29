public class Gold extends MembershipType {
    public static int minimumPoints = 20;
    public Gold(int maxTradesPerDay) {
        super(maxTradesPerDay);
    }

    @Override
    public boolean canTrade() {
        return false;
    }
}
