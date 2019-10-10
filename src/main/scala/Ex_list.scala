import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Ex_list {
  def main(args: Array[String]): Unit = {

    //todo List不可变集合
    val list1 = List(1,2,3,4)
    val list2 = List(5,6,7,8)
    println(list1.mkString(","))
    println(list2.mkString(","))

//    val list3 = list1.++(list2)
    val list3 = list1++list2

    println(list3.mkString(","))

    val list4 = list3:+1024

    println(list4.mkString(","))

    val list5 = 2048+:list3:+1024

    println(list5.mkString(","))

    val list6 = list3.::(4096)

    println(list6.mkString(","))

    //集合中的冒号运算符是从右到左运算
    val list7 = 1024 :: 2048 :: list3

    println(list7.mkString(","))

    //双冒号连接集合，相当于把前面一个集合作为一个元素放入后面的集合中，形成二维数组式的集合
    val list8 = 999::list1::list2
    println(list8.mkString(","))

    //三冒号是取出集合里的元素进行连接
    val list9 = 999::list1:::list2
    println(list9.mkString(","))

    //修改集合中的数据，产生新的集合
    val list10 = list3.updated(0,888)
    println(list10.mkString(","))


    //todo 可变集合
    val mlist = ListBuffer(1,2,3,4)
    println(mlist.mkString(","))


    //todo 队列
    val queue = mutable.Queue[Int]()
    queue.enqueue(1,2,3,4,5,6)
    println(queue.mkString(","))

    queue.dequeue()
    println(queue.mkString(","))

    queue.dequeue()
    println(queue.mkString(","))

    queue.enqueue(1024,2024,3024,4024,5024,6024)
    println(queue.mkString(","))
  }
}
