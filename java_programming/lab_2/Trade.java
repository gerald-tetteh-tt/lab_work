class Trade {
	private String id;
	private String symbol;
	private int quantity;
	private double price;

	public Trade(String id, String symbol, int quantity, double price) {
		this.id = id;
		this.symbol = symbol;
		this.quantity = quantity;
		this.price = price;
	}

	public Trade(String id, String symbol, int quantity) {
		this(id,symbol,quantity,0);
	}

	public void setPrice(double newPrice) {
		if(newPrice < 0) return;
		this.price = newPrice;
	}

	public double get() {
	}

	@Override
	public String toString() {
		return "Trade("+id+","+symbol+","+quantity+","+price+")";
	}
}
