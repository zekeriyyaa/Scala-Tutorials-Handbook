object String {
  def main(args: Array[String]): Unit = {

    var myString: String = "hello World!"

    println(myString.length())
    println("hello".length())

    var combinedString: String = "hello".concat("world")
    println(combinedString)

    var (x: Int, y: Int) = (11, 22)
    println("x=%d y=%d", x, y)
    println(s"x=$x y=$y")
    println(s"${x}")

    var str1 = "Scala \tsring \nexample"
    var str2 = raw"Scala \tstring \nexample"
    println(str1 + str2)

  }

}
