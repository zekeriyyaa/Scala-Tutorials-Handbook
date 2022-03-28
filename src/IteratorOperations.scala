import org.omg.CORBA.IDLType

object IteratorOperations {
  def main(args: Array[String]): Unit = {


    var iter = Iterator(10, 60, 30, 90, 50)
    while (iter.hasNext) {
      println("next: " + iter.next())
    }
    var iter2 = Iterator(10, 60, 30, 90, 50)
    // if you call these methods, iterator will be at the end of the list. So, the second one wont be able to check.
    // you have to define iterator again
    println("max: " + iter2.max)
    var iter3 = Iterator(10, 60, 30, 90, 50)
    println("size: " + iter3.size)
    var iter4 = Iterator(10, 60, 30, 90, 50)
    println("length: " + iter4.length)

    // concatenate
    var iter5 = Iterator(1, 2, 3, 4).++(Iterator(5, 6, 7, 8))
    while (iter5.hasNext) {
      println(iter5.next())
    }

    // String Builder
    var iter6 = Iterator(1, 2, 3, 4, 5)
    // this makes given iter values to a new string
    println(iter6.addString(new StringBuilder))
    var iter7 = Iterator(1, 2, 3, 4, 5)
    println(iter7.addString(b = new StringBuilder, sep = "-"))

    // check contains
    var iter8 = Iterator(1, 2, 3, 4, 5)
    println(iter8.contains(4))

    // copy to array
    var iter9 = Iterator(1, 2, 3, 4, 5)
    var arr = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
    // target, start index, end index
    iter9.copyToArray(arr, 4, 9)
    for (a <- arr) {
      println(a)
    }

    // count
    var iter11 = Iterator(1, 2, 3, 4, 5)
    println(iter11.count(x => true))
    // you have to specify a condition
    var iter22 = Iterator(1, 2, 3, 4, 5)
    println(iter22.count(x => {
      x % 2 == 0
    }))

    // dropWhile : if the condition is satisfied passes the value to the next
    var iter33 = Iterator(1, 2, 3, 4, 5, 6, 7, 8, 9)
    var iter34 = iter33.dropWhile(x => {
      x < 5
    })
    // this prints value not smaller than 5
    while (iter34.hasNext) {
      println(iter34.next())
    }

  }

}
