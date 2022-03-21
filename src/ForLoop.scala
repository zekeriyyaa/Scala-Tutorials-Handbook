object ForLoop {
  def main(args: Array[String]): Unit = {

    var a = 0
    for (a <- 1 to 10) {
      println("Current step is " + a)
      //1,2,,,10
    }

    for (a <- 1 until 10) {
      println("Current step is " + a)
      //1,2,,,9
    }

    for (a <- 1 to 10 by 2) {
      println("Current step by 2 is " + a)
      // 1,3,5,7,9
    }

    // **************************************

    for (a <- Array.range(1, 10)) {
      println("Current step is " + a)
      //1,2,,,9
    }

    for (a <- Array.range(1, 10, 2)) {
      println("Current step is " + a)
      //1,3,,,9
    }

    // *******************************

    for (a <- List.range(1, 10)) {
      println("Current step is " + a)
      //1,2,,,9
    }

    for (a <- List.range(1, 10, 2)) {
      println("Current step is " + a)
      //1,3,,,9
    }


    // NESTED LOOP
    for (a <- 1 to 5; b <- 1 to 3) {
      println("The value of a is " + a + " The value of b is " + b)
    }

    for (a <- 1 until 5; b <- 1 to 3) {
      println("The value of a is " + a + " The value of b is " + b)
    }


    // LOOP LIST

    val numList = List(1, 2, 3, 4, 5, 6, 7)
    for (a <- numList) {
      println("The current value of list is " + a)
    }

    for (a <- numList if a != 3; if a < 6) {
      println("The current value of list is " + a)
    }
    for (a <- numList if a != 3 && a < 6) {
      println("The current value of list is " + a)
    }

    // FOR EXPRESSION

    var retVal = for {a <- numList} yield a
    for (b<-retVal)
      {
        println("The value is : "+b)
      }

  }

}
