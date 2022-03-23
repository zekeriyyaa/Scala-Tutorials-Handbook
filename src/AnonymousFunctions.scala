/*
* Anonymous functions have no input argument and no return value
* */
object AnonymousFunctions {
  def main(args: Array[String]): Unit = {
    val f = () => {
      println("hello"); println("world")
    }
    f()
  }


}
