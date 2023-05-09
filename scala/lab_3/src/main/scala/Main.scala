package io.turntabl

import trade.Trade

object Main extends App {
  val trade = Trade(id = "T1", symbol = "APPL", quantity = 100, initialPrice = 15.25)
  trade.price = -23;
  println(trade)
  println(trade.price)
  val trade2 = Trade(id = "T1", symbol = "APPL", quantity = 100, initialPrice = 15.25)
  println(trade.equals(trade2))
  println(trade.hashCode())
  println(trade2.hashCode())
}