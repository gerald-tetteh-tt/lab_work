import customer.Customer
import library.Library
import membershipType.{Junior, NonMember, Regular, SeniorCitizen}

object Main extends App {
  val library = new Library()
  val gerald = new Customer("Gerald", Regular())
  val ronaldo = new Customer("CR7", SeniorCitizen())
  val max = new Customer("Super max", Junior())
  val lewis = new Customer("My tiers are dead", NonMember())

  library.borrowItem(gerald,4)
  library.borrowItem(ronaldo,7)
  library.borrowItem(max,4)
  library.borrowItem(lewis,8)
}