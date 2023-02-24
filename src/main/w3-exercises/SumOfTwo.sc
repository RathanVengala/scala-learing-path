object SumOfTwo{
  def sumOfTwoNumbers(x: Int,y:Int): Int = {
    if(x==y) (x+y)*3 else x+y
  }
  def main (args:Array[String]): Unit = {
    println("sum of 3,4 : "+ sumOfTwoNumbers(3,4) )
    println("sum of 55,55 : "+ sumOfTwoNumbers(55,55))
  }
}