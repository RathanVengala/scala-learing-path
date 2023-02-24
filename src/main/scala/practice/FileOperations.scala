import scala.io.Source


object FileOperations{
  def main (args:Array[String]): Unit =
    if (args.length>0){
      for (line <- Source.fromFile(args(0)).getLines()){
        println(line.length + " "+ line)
      }

  }
    else
      println("Please enter file name")

}
