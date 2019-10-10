import scala.collection.mutable.ArrayBuffer

object Ex_array {
  def main(args: Array[String]): Unit = {

    //不可变数组
    val ints: Array[Int] = Array(1, 2, 3, 4)

    //用小括号访问，java中用中括号
    println(ints(0))

    println("------循环数组------")
    for (elem <- ints) {
      println(elem)
    }

    ints.foreach(i => {
      print("-->")
      println(i)
    })

    ints.foreach(i=>{println(i)})
    ints.foreach(println(_))
    ints.foreach(println)

    //修改数组里的元素
    ints.update(0,9)
    ints.update(3,8)
    println(ints.mkString(","))

    //增加数组里的元素，这里注意 todo 和java一样，数组地址不可变，新增数组元素意味着创建一个新的数组
    val ints1: Array[Int] = ints:+(5)
    val ints2: Array[Int] = 5+:ints
    println(ints1.mkString(","))
    println(ints2.mkString(","))

    println("--------从头移除元素-------")
    println(ints.mkString(","))
    val ints3: Array[Int] = ints.drop(2)
    println(ints3.mkString(","))


    println("------可变数组------")
    //可变数组
    val ab: ArrayBuffer[Int] = ArrayBuffer(5,6,7,8)

    println(ab(0))
    println(ab.mkString(","))

    ab.foreach(println)
    ab.forall(i=>{if(i>5) true else false})

    //修改
    ab(0) = 199
    println(ab.mkString(","))

    //增加
    ab.insert(1,299)
    println(ab.mkString(","))

    ab+=(399)
    println(ab.mkString(","))

    ab+=(1024)
    println(ab.mkString(","))

    //删除数据
    ab-=(399)
    println(ab.mkString(","))

    //移除
    ab.remove(0)
    println(ab.mkString(","))

    //可变数据和不可变数据转换
    val buffer = ints.toBuffer
    val array = ab.toArray
  }
}
