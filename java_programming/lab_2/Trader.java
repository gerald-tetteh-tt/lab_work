class Trader {
	private String name;
	private Account account;

	public Trader(String name) {
		this.name = name;
		this.account = Account();
	}
	
	public void addTrade(Trade trade) {
		account.setTotalValueOfTrades(account.getTotalValueOfTrades() + (trade.price * trade.quantity));
	}
}
