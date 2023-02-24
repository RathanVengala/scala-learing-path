object ListExample{
  def main(args:Array[String]): Unit = {
    val list1 = List("Sandeep","Jackson","Kennet","Linto")
    val list2 = "Roshan"::list1
    val list3 = "Kulkarni" :: "Opera" :: "Polishetty" :: Nil
    val list4 = list2 ::: list3
    val list5 = list4.dropRight(2)
    val thrill = "test" ::"testExample" :: list3
    println(thrill.count(s=>s.length==1))
    println(list3.count(s  => s.length == 8))
    println(thrill.exists(s=>s=="until"))
    println("mkString example :  "+ thrill.mkString(","))
    println("map example : "+ thrill.map(s=>s+"y") )
    println(thrill.filter(s=> s.length==5))
    println("init example : " + thrill.init)
    println("List 4 : "+list4)
    println("List 5 : " +list5)
    println("thrill : "+thrill)

  }

}