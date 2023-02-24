 object Practice {
  def main(args:Array[String]): Unit = {
    val greetings = new Array[String](9)

    greetings(0)="Hello"
    greetings(1)="World"
    greetings(4)= "Good evening"

    for(i<- 0 to 9  ){
      println(greetings(i))

    }
  }

}
