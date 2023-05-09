package io.turntabl
package trade

case class Trade(val id: String, val symbol: String, val quantity: Int, initialPrice: Double) {
  private var _price = initialPrice

  def price: Double = _price

  def price_= (newPrice: Double): Unit = {
    if newPrice >= 0 then _price = newPrice
  }

  def value: Double = quantity * price

//  override def toString = s"Trade($id, $symbol, $quantity, $price)"
}

//object Trade {
//  def apply(id: String, symbol: String,
//                    quantity: Int, initialPrice: Double): Trade =
//    new Trade(id, symbol, quantity, initialPrice)
//}