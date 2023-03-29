public class Client {
    private final String firstName;
    private final String lastName;
    private MembershipType membershipType;
    private int points;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addTrade(Trade trade) {
        this.points++;
    }
}
