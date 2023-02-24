package practice

class CheckClass {
  private var sum = 10
  def add(b:Int ): Int = {
    sum += b
    return sum
  }

}
object Main{
  def main(args: Array[String]): Unit = {
    val checkClass = new CheckClass()
    println(checkClass.add(90))
  }

}
