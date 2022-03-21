/*
* Scala has not static methods or fields.
* Instead, you can use the object construct.
* An object defines a single instance of a class with the feature that you want.*/
object BankAccounts {
  private var lastNum = 0

  def newUnique() = {
    lastNum += 1;
    lastNum
  }
}


object SingletonObject {
  def main(args: Array[String]): Unit = {
    println("The next number: " + BankAccounts.newUnique())
    println("The next number: " + BankAccounts.newUnique())
    println("The next number: " + BankAccounts.newUnique())
    println("The next number: " + BankAccounts.newUnique())
    println("The next number: " + BankAccounts.newUnique())
  }

}
