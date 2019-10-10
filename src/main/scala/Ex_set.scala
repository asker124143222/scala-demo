import scala.collection.mutable

object Ex_set {
  def main(args: Array[String]): Unit = {

    //不可变无序集合set
//    val set = Set[Int]()
    val set = Set(5,6,7)
    println("set: "+set.mkString(","))

    val set2 = set+1+2+3+4


    println("set2: "+set2.mkString(","))

    val set3 = set - 7 -5

    println("set3: "+set3.mkString(","))

    val set10 = Set(1,2,3)
    val set11 = Set(4,5,6)
    val set12: Set[Int] = set10++set11
    println(s"set12: ${set12.mkString(",")}")

    //可变无序集合set
    val mSet = mutable.Set(1,2,3,4)
    val bool: Boolean = mSet.add(5)

    println(s"成功：${bool} -->" + mSet.mkString(","))
  }
}
