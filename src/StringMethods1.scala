object StringMethods1 {
  def main(args: Array[String]): Unit = {

    var str: String = "Hello World"
    // charAt : returns the character at the given index
    println(str.charAt(3))
    println("**************")
    // compareTo : compares a string to another object
    println(str.compareTo("Hello World")) // 0 : same
    println(str.compareTo("HelloWorld"))
    println(str.compareTo("Hello world"))
    println(str.compareTo("Hello World ")) // -1 : one space blank
    println("**************")
    // compareToIgnoreCase : compares two strings ignoring the case differences
    println(str.compareToIgnoreCase("Hello World")) // 0 : if they are same
    println(str.compareToIgnoreCase("HELLO World"))
    println(str.compareToIgnoreCase("HelLO world"))
    println(str.compareToIgnoreCase("Hello  World "))
    // contentEquals : compares two str if equal return True otherwise return false
    println(str.contentEquals("Hello World")) // 0 : same
    println(str.contentEquals("HelloWorld"))
    println(str.contentEquals("Hello world"))
    println(str.contentEquals("Hello World ")) // -1 : one space blank
    println("**************")
    // check the last characters
    println(str.endsWith("d"))
    println(str.endsWith("sgd"))
    println(str.endsWith("rld"))
    println(str.endsWith("orld"))
    println("**************")
    println(str.getBytes())


  }

}
