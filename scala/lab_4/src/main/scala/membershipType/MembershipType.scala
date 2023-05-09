package membershipType

sealed trait MembershipType {
  def borrowAllowance: Int
}

case class NonMember() extends MembershipType {
  override def borrowAllowance: Int = 0
}
case class Regular() extends MembershipType {
  override def borrowAllowance: Int = 6
}
case class Junior() extends MembershipType {
  override def borrowAllowance: Int = 3
}
case class SeniorCitizen() extends MembershipType {
  override def borrowAllowance: Int = 12
}