package library

import customer.Customer
import membershipType.{Junior, Regular, SeniorCitizen}

class Library {

  def borrowItem(customer: Customer, itemCount: Int): Unit = {
    customer.membershipType match {
      case r: Regular if r.borrowAllowance >= itemCount =>
        println(s"Borrowed $itemCount items")
      case j: Junior if j.borrowAllowance >= itemCount =>
        println(s"Borrowed $itemCount items")
      case s: SeniorCitizen if s.borrowAllowance >= itemCount =>
        println(s"Borrowed $itemCount items")
      case _ => println("Can not borrow books")
    }
  }
}
