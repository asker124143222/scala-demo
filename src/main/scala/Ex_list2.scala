object Ex_list2 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5,1,2,3)

    //集合常用方法
    println("sum="+list.sum)
    println("max="+list.max)
    println("min="+list.min)

    //乘积
    println("produce="+list.product)

    //反转
    println("reverse="+list.reverse)

    //分组
    //按返回元素值分组
    val groupMap: Map[Int, List[Int]] = list.groupBy(x=>x)
    groupMap.foreach(t=>{
      println(t._1+" = "+t._2)
    })
    println("group="+list.groupBy(x => x))

    //奇偶分组
    val gMap = list.groupBy(x=>{x % 2})
    gMap.foreach(t=>{println("group2="+t._1+" = "+t._2)})

    val stringList = List("13","12","27","24","26")
    //按首字母分组
    val sMap: Map[String, List[String]] = stringList.groupBy(s=>{s.substring(0,1)})
    sMap.foreach(t=>{println("group3="+t._1+" = "+t._2)})

    //排序
    val sList: List[String] = stringList.sortBy(s=>{s.substring(1)})
    println("sort = "+sList.mkString(","))

    //排序升序
    val sortedList = list.sortWith((x,y)=>{x<y})
    println("sort asc = "+sortedList.mkString(","))

    //取前三的数据
    val topList = sortedList.take(3)
    println("top 3 = "+topList.mkString(","))

    //迭代器
//    list.iterator.foreach(println)

    //映射 map
    val mapList: List[(Int, 1)] = list.map(x=>{(x,1)})
    println(mapList.mkString(","))

    val mapList2: Map[Int, List[(Int, Int)]] = list.map(x=>{(x,1)}).groupBy(t=>t._1)
    println(mapList2.mkString(","))

    val mapList3: Map[Int, List[(Int, 1)]] = mapList.groupBy(t=>t._1)
    println(mapList3.mkString(","))

    val map11 : Map[Int,List[(Int,Int)]] = Map((1,List((11,1))),(2,List((22,1))),(3,List((33,1))),(4,List((44,1))))
    println(map11.mkString(","))

    //word count
    val wordList = List("Hello","world","Hello","spark","hbase","kafka","scala","Hello","world")

    val wordToList: List[(String, List[String])] = wordList.groupBy(s=>s).toList
    val countToList: List[(String, Int)] = wordToList.map(t=>(t._1,t._2.size))
    val wordSortedList: List[(String, Int)] = countToList.sortWith((left, right)=>{left._2>right._2})
    println("word count = "+countToList.mkString(","))
    println("word count sorted = "+wordSortedList.mkString(","))

    println("top 3 = "+wordSortedList.take(3).mkString(","))


    //flatmap 数据扁平化

    val lineList = List("Hello world","Hello scala","Hello spark","hadoop world")
    val resultList: List[(String, Int)] = lineList.flatMap(s=>s.split(" "))
      .groupBy(s=>s).toList
      .map(t=>(t._1,t._2.size))
      .sortWith((x, y)=>{x._2>y._2})

    println("flatMap word count = "+resultList.mkString(","))

    //filter 保留结果范围true的数据
    val filterList = resultList.filter(t=>{t._2>1})
    println("filter > 1 = "+filterList.mkString(","))


    //zip 拉链，将两个集合两两组合成tuple
    val list1 = List(1,2,3,6)
    val list2 = List(4,5,6,3)
    val tuples: List[(Int, Int)] = list1.zip(list2)
    println("zip = "+tuples.mkString(","))

    //交集
    val intersectList: List[Int] = list1.intersect(list2)
    println("intersect = "+intersectList.mkString(","))

    //并集
    val unionList: List[Int] = list1.:::(list2)
    println("union = "+unionList.mkString(","))

    val uList: List[Any] = list1.::(list2)
    println(" u :: = "+uList.mkString(","))

    val diffList: List[Int] = list1.diff(list2)
    println("diffList = "+diffList.mkString(","))

    //reduce 规约
    val retSum: Int = list1.reduce((x, y)=>{x-y})
    println(s"reduce = ${retSum}")

    //参数只出现一次可以省略，计算过程只出现一次可以用下划线代替
    val retSum2 = list2.reduce(_-_)
    println(s"reduce2 = ${retSum2}")
  }
}
