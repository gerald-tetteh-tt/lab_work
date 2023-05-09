import trade.EquityTrade

@main
def main(): Unit = {
  val trade = new EquityTrade(id = "AL",symbol = "CR7", quantity = 500, initialPrice = 99.9)
  println(trade)
}