/*
*  - List are quite similar to arrays.
*  - All elements must be the same type.
*  - Difference btw Array:
*      - List are immutable
*      - List represent a liked list whereas arrays are flat
*
* Head : returns the first element of List
* Tail : returns a list consisting of all elements except the first
* IsEmpty : return true if the list is empty otherwise false
* */
object ListOperations {
  def main(args: Array[String]): Unit = {

    var fruit: List[String] = List("apple", "banana", "orange")
    var numbers: List[Int] = List(1, 2, 3, 4, 5, 6)
    // Empty List
    var empty: List[Nothing] = List()
    // 2D List
    var arr: List[List[Int]] = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))

    /*  All list can be defined using two fundamental building blocks, "a tail Nil" and "::"  */
    /*  Nil also represents the empty list.  */

    var fruit2 = "apples" :: ("oranges" :: ("banana" :: Nil))
    var numbers2 = 1 :: (2 :: (3 :: Nil))
    var empty2 = Nil
    var arr2 = (1 :: (2 :: (3 :: Nil))) :: (4 :: (5 :: (6 :: Nil))) :: (7 :: (8 :: (9 :: Nil)))

    /*
    * Head : returns the first element of List
    * Tail : returns a list consisting of all elements except the first
    * IsEmpty : return true if the list is empty otherwise false
    * */

    var myList = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println("Array : " + myList)
    println("head : " + myList.head)
    println("tail : " + myList.tail)
    println("isEmpty : " + myList.isEmpty)


    // List.fill() : creates a list consisting of zero or more copies of the same element.
    var myList2 = List.fill(3)("apples")
    println(List.fill(5)("zekeriyya"))

    // List.tabulate() : same as fill but not exactly
    var myList3 = List.tabulate(6)(n => n * n)
    var myList4 = List.tabulate(4, 5)(_ * _)   // _ : acts like placeholder
    println(myList3)
    println(myList4)

    var test=List(1,2,3,4,5,6,7,8,9)
    println(test.reverse)
    println(test.contains(4))
    println(test.contains(22))
    println(test.equals(myList))
    println(test.equals(myList3))
    println(test.isEmpty)
    println(test)

  }

}
