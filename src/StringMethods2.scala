object StringMethods2 {
  def main(args: Array[String]): Unit = {

    // getChars : copies characters from the string into rhe destination     character array
    var str:String="Hello World"
    var c:Array[Char]=Array('h','e','l','l','o')
    var d="abcdefg"
    d.getChars(2,4,c,2)
    for(i<-c)
      {
        println(i)
      }
      // hecdo

    println(str.hashCode)

    println("******************")
    // indexOf : returns the index of the first occurence of the charater ch in the string
    println(str.indexOf("e"))
    println(str.indexOf("ll"))

    println("******************")
    println("hello \n\tworld")

    println("******************")
    // lastIndexOf : returns the index of last occurence
    println(str.lastIndexOf("o"))

    // matches : if str matches the regular expression return true otherwise return false
    println(str.matches(".*i"))
    println(str.matches(".*o"))
    println(str.matches(".i"))

    // replace
    println(str.replaceAll("ll","kk"))


  }
}
