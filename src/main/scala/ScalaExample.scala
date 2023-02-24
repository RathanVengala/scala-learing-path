object ScalaExample{
  def main(args:Array[String]): Unit = {
    var i: Int = 20
    var result = checkAge(20)
    println(result)
    patternMatching("Mukti")
    forExample()
    /*if (i>18){
      println("pass")
    }
    else{
      println("Fail")
    }*/
  }
  private def checkAge(i: Int) = if(i>18) "Pass" else "Fail"

  def patternMatching(x: String): Unit = {
    var s = "Mukti"

    x match{
      case "Mukta" => println("not matched")
      case s => println("matched")
    }
  }

  def forExample(): Unit = {
    var list1 = List(23,3,2,34,5,6,7)
    for(i <- 1 to 10 if i%2 ==0){
      print(i+ " ")
    }
    for(i <- list1 if i%2==0){
      println(i)
    }
    list1.foreach{
      print
    }
    list1.foreach(print)
    println
    list1.foreach((element:Int) => println(element + " "))

  }
}