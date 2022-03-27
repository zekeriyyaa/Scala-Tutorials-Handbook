/*
* Keys are unique
* Maps are also called Hash Tables
* It could be mutable or immutable(default).
* */
object MapOperations {
  def main(args: Array[String]): Unit = {

    var map: Map[Char, Int] = Map()
    map += ('a' -> 1)
    map += ('b' -> 2)
    map += ('c' -> 3)

    println(map)

    var colors = Map("red" -> "xxx", "white" -> "fff")
    var fruits = Map("a" -> "xxx", "b" -> "fff")
    colors += ("black" -> "xxx")
    println(colors)
    println(colors.keys)
    println(colors.values)
    println(colors.isEmpty)

    // 1. Way
    println(fruits ++ colors)
    // 2. way
    println(fruits.++(colors))

    println(colors.contains("red"))
    println(colors.get("red"))
    println(colors.toList)

  }

}
