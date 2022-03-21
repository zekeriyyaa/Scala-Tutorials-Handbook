object While_DoWhile_Loops {
  def main(args: Array[String]): Unit = {


    // while loop
    var count: Int = 10
    while (count > 0) {
      println("Current step is " + count)
      count -= 1
    }

    println("**********************")

    //do-while loop
    do {
      println("Current step is " + count)
      count += 1
    } while (count < 10)

    println("**********************")


  }

}
