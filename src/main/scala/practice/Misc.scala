object Misc{
  def main(args:Array[String]){
    printArgs(Array("Zara","H"))

  }
  def printArgs(args:Array[String]): Unit = {
    args.foreach(println)
  }
  def formatArgs(args:Array[String]) = args.mkString("\n")
}