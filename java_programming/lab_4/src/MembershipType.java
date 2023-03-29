public abstract class MembershipType {
    private final int maxTradesPerDay;

    public MembershipType(int maxTradesPerDay) {
        this.maxTradesPerDay = maxTradesPerDay;
    }

    public int getMaxTradesPerDay() {
        return maxTradesPerDay;
    }

    public abstract boolean canTrade();
}
