package patternMatching

import scala.annotation.tailrec

object PatternMatching {

  def questionOne(number: Int): String = {
    number match {
      case x if x < 0 => "<0"
      case x if x >= 0 && x <= 18 => "0<=number<=18"
      case x if x >= 19 && x <= 35 => "18<=number<=35"
      case x if x >= 36 && x <= 65 => "36<=number<=65"
      case x if x > 65  => ">65"
    }
  }

  def questionTwo(list: List[Any]): Any = {
    list match {
      case Nil => 0
      case List(_, _, x) => x
      case _ => list.head
    }
  }

  def questionThree(item: Matchable): Int = {
    item match {
      case l: List[Any] => l.length
      case m: Map[Any,Any] => m.size
      case v: Vector[Any] => v.size
      case _ => -1
    }
  }

  def questionFour(s: String): Boolean = {

    @tailrec
    def hasValidParenthesis(chars: List[Char], stackCount: Int): Boolean = {
      if(stackCount < 0) false
      else {
        chars match {
          case Nil => stackCount == 0
          case head :: tail if (head == '(') => hasValidParenthesis(tail,stackCount + 1)
          case _ => hasValidParenthesis(chars.tail, stackCount - 1)
        }
      }
    }

    hasValidParenthesis(s.toList,0)
  }
}
