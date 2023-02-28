import FileOperations.processFiles

object FindLongLInes{
  def findLongLInes (args:Array[String]): Unit = {
    val width  = args(0).toInt
    for(arg <- args.drop(1)){
      FileOperations.processFiles(arg,width)
    }
  }

  def main (args: Array[String]): Unit = {
    findLongLInes(Array("10","E:\\files\\java-learning-path.txt"))
  }
}