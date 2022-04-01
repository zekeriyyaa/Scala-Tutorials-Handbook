object MatchOperation {
  def main(args: Array[String]): Unit = {

    println(matchDemo(2))
    println(matchDemo(1))
    println(matchDemo("two"))
    println(matchDemo(true))


    def matchDemo(x: Any): Any = x match {
      case 1 => "one"
      case "two" => 2
      case y: Int => "scala.Int"
      case _ => "many"
    }

    var customers: List[String] = List("zekeriyya", "ahmet", "sergen")

    for (customer <- customers) {
      customer match {
        case "zekeriyya" => println("hello zekeriyya")
        case "ahmet" => println("hello ahmet")
        case _ => println("hello guys")
      }
    }

  }

}
