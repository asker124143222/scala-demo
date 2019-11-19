object Ex_tuple {
  def main(args: Array[String]): Unit = {
    //todo 用一对小括号表示元组
    val tuple = ("zhangsan", 1024, "54")
    val tuple2: (Int, Int, String) = (123,456,"aaa")

    println(tuple)
    println(tuple2._1)
    println(tuple2)
    tuple2.productIterator.foreach(println)
    for(e<-tuple2.productIterator){
      if(e.equals(123))
        println(s"found : ${e}")
      else
        println(s"not result: ${e}")
    }


    //todo 如果元组中只有两个元素，那么称之为对偶，类似map中的键值对，map中就可以直接使用对偶
    val map: Map[Int, String] = Map((1,"a")) //Map的构造函数里放的是tuple元组，必须是对偶的元组
    val t = new Tuple2(2,"b")
    val map2 = map + t
    println(map2.mkString(","))
    map2.foreach(t=>{
      println(t)
      println(t._1+" = "+t._2)
    })
  }
}
