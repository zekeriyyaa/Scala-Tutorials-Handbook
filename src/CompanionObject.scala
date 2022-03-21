/*
* The class and its companion have the same name and access each other's private features.
* They must be located in the same source file.
*
* In Java or C++, you often hava a class with both instance methods and static methods.
* In Scala, you can achieve this by having a class and a companion.
* */
class Account {
  val id = Account.newUniqueNumber()
  private var balance = 0.0

  def deposit(amount: Double): Unit = {
    balance += amount
  }

  def balanceEquiry() = balance
}

// The companion object
object Account {
  private var lastNumber = 0

  private def newUniqueNumber() = {
    lastNumber += 1;
    lastNumber
  }
}

object CompanionDemo {
  def main(args:Array[String])={
    var accno1=new Account()
    println("Current new account number: "+accno1.id)
    accno1.deposit(1000)
    println("Current account balance = "+accno1.balanceEquiry())
    accno1.deposit(8000)
    println("Current account balance = "+accno1.balanceEquiry())

    var accno2=new Account()
    println("Current new account number: "+accno2.id)
    accno2.deposit(1000)
    println("Current account balance = "+accno2.balanceEquiry())
    accno2.deposit(8000)
    println("Current account balance = "+accno2.balanceEquiry())

  }

}
