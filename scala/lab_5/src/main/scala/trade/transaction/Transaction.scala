package trade.transaction

import trade.EquityTrade

class Transaction(id: String, symbol: String, quantity: Int, initialPrice: Double) 
  extends EquityTrade(id, symbol, quantity, initialPrice) with Taxable with FeePayable {
  
  def amount: Double = {
    val totalAmount = value + fee
    totalAmount + (totalAmount * tax)
  }
}
