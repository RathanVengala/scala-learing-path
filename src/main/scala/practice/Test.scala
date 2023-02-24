package practice

import scala.::

object Test {
  def main(args: Array[String]): Unit = {
    val greetings = new Array[String](9)

    greetings(0) = "Hello"
    greetings(1) = "World"
    greetings(4) = "Good evening"
    val greetings1 = greetings

    val list0 = List(1,2,3)
    val list1 = 3 :: list0

    val list2 = list0 ::: list1
    println(list2)
    println(list1)

    for (i <- list2.indices) {
      print()

    }
  }
}

