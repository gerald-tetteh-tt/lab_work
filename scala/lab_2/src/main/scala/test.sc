val order = "The glass is full of beer"

val drinkMatcher = raw".* (glass|bottle) .* of (wine|coke|beer)".r

try {
  order match {
    case drinkMatcher(amount,drink) => s"$amount, $drink"
  }
} catch {
  case err: MatchError => err.printStackTrace()
}

val passwdMatcher = raw"(.*):(.*):([0-9]*):([0-9]*):(.*):(.*):(.*)".r
val passwdMatcher(username, password, userid, groupId, description, homeDirectory, shell) = "root:x:0:0:root:/root:/bin/bash"