import scala.io.Source


object FileOperations{

  private var increment: Int => Int = (x: Int) => x + 1

  def main(args:Array[String]): Unit = {
    println(increment(3))
  }
  def processFiles(filename:String,width : Int): Unit = {
    val source = Source.fromFile(filename)

    for (line <- source.getLines) {
      processLines(filename, width, line)
    }
  }
  private def processLines(filename: String, width: Int,line: String): Unit = {
      if(line.length>width)
        println(filename+": "+line.trim +", ",line.length)
    }
}
