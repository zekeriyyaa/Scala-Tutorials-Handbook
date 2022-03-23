import jdk.nashorn.internal.parser.DateParser

/*
* Functions are object
* Methods can defined within an object
* */

object FunctionVsMethods {
  def main(args: Array[String]): Unit = {

    println(myGetAreaMethod(3))
    println(myGetAreaFunction(3))
  }
  //method
  def myGetAreaMethod(rad: Double): Double = {
    val PI = 3.14
    PI * rad * rad
  }
  // function
  def myGetAreaFunction = (rad: Double) => {
    val PI = 3.14
    PI * rad * rad
  }: Double

}


