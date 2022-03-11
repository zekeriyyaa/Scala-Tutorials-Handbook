class MyClassOne(val name: String, val age: Int) {
  // primary constructor
  println("Class is started ...")

  def displayValues(): Unit = {
    println(s"Name=$name Age=$age ...")
  }

  // auxiliary constructor
  def this(name: String) {
    this(name, 40)
  }


}


object TestMyClassOne {
  def main(args: Array[String]): Unit = {

    val object1 = new MyClassOne(name = "Zekeriyya", age = 36)
    object1.displayValues()

    val object2 = new MyClassOne(name = "Serkan")
    object2.displayValues()

  }
}
