import scala.collection.{immutable, mutable}
import scala.collection.mutable.Set
object SetsAndMapsExample{
  def main(args:Array[String]): Unit = {
    //Sets
    var set1 = immutable.Set("KL","8",9)
    val set2 = mutable.Set("Airline", "Boing")
    set1 += "OP"
    set2 += "JK"
    println(set1.contains("OP"))
    println("immutable : " +set1)
    println("mutable : " + set2)

    //Maps
    var treasureMap = Map[Int,String]()
    treasureMap += (1 -> "first Element")
    treasureMap += (2 -> "second Element")

    println(treasureMap.get(2))
  }

}