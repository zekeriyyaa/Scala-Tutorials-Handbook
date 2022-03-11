object SatementsExpressions {
  def main(args: Array[String]): Unit = {

    // expression

    // last part runs as return value
    val areaCal = {
      val pi = 3.14
      val radius = 4
      pi * radius * radius
    }

    println(areaCal)


    // Nested Expression
    val myValue = {
      val PI = 3.0
      println(s"The value of PI in the outer expression block =$PI");
      {
        val PI = 3.14;
        val radius = 2
        println(s"The value of PI inner expression block =$PI")
        PI * radius * radius
      }
    }

    println(myValue)

  }
}
