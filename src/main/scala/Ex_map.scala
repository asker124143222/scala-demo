import scala.collection.mutable

object Ex_map {
  def main(args: Array[String]): Unit = {

    //todo 不可变map
    val map: Map[Int, String] = Map(1 -> "a",2->"b",3->"c")

    println(s"map: ${map.mkString(",")}")

    val map2 = map+(4->"d") + (5->"e")+ (6->"f")
    println(s"map2: ${map2.mkString(",")}")

    val map3 = map - (2,3)
    println(s"map3: ${map3.mkString(",")}")

    val map4 = map + (1->"AA")
    println(s"map4: ${map4.mkString(",")}")

    val map5: Map[Int, String] = map.updated(1,"abccc")
    println(s"map5: ${map5.mkString(",")}")

    println(map.get(1))
    println(map.get(1).get)
    println(map.get(12).getOrElse("null"))

    println(map.getOrElse(1, "null"))
    println(map.getOrElse(11, "null"))

    //todo 可变map

    val mMap1: mutable.Map[Int, String] = mutable.Map(1 -> "a",2->"b",3->"c")
    println(mMap1.mkString(","))
    val ret: Option[String] = mMap1.put(4, "d")
    println(mMap1)
    println(ret.getOrElse("null"))


    val ret2: Option[String] = mMap1.put(1, "aaa")
    println(mMap1)
    println(ret2.getOrElse("null"))

  }
}
