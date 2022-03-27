/*
*  Unlike an array or list, a tuple can hold objects with different types but they are also immutable
* Tuples are type of Tuple1-2-3-4...22. There is a bound. If you need more, you can use a collection, not a tuple.
* */
object TupleOperations {
  def main(args: Array[String]): Unit = {

    var t = (1, "test")
    var t1 = new Tuple3(1, 2, 3)
    var t2 = new Tuple4(1, 2, 3, 4)
    var t3 = new Tuple5(1, 2, 3, 4, 5)

    // access
    println(t1._1)
    println(t1._2 + t2._4 + t3._4)

    // you can use tuple.productIterator method to iterate over all elements of tuple

    t3.productIterator.foreach(i=>println("value: "+i))

    println(t3.toString())
    println(t.swap)


  }

}
