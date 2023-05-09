import java.time.LocalDate
import java.time.format.DateTimeFormatter

object Lab {

  def celsiusToFahrenheit(celsius: Double): Double = (celsius * 9 / 5) +  32

  def toFullDate(date: String): String = {
    val parseFormat = DateTimeFormatter.ofPattern("dd/MM/yy")
    val outputFormat = DateTimeFormatter.ofPattern("d LLLL yyyy")
    val parsedDate = LocalDate.parse(date,parseFormat);
    parsedDate.format(outputFormat)
  }

  def toFullDateManual(date: String): String = {
    val dayString = date.substring(0,2)
    val day = dayString.toInt
    val month = date.substring(3,5)
    val year = date.substring(6,8)
    s"$day${getDayOrdinal(dayString)} ${getMonthText(month)} 20$year"
  }

  def parseUnixPassword(pwd: String): Unit = {
    val passwdMatcher = raw"(.*):(.*):([0-9]*):([0-9]*):(.*):(.*):(.*)".r
    val passwdMatcher(username,password,userid,groupId,description,homeDirectory,shell) = pwd
    // print out the values if you want
  }

  private def getDayOrdinal(day: String): String = {
    day match {
      case "11" | "12" | "13" => "th"
      case i if i.matches(".1") => "st"
      case i if i.matches(".2") => "nd"
      case i if i.matches(".3") => "rd"
      case _ => "th"
    }
  }
  private def getMonthText(month: String): String = {
    month match {
      case "01" => "January"
      case "02" => "February"
      case "03" => "March"
      case "04" => "April"
      case "05" => "May"
      case "06" => "June"
      case "07" => "July"
      case "08" => "August"
      case "09" => "September"
      case "10" => "October"
      case "11" => "November"
      case "12" => "December"
    }
  }
}
