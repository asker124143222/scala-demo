object Ex_match4 {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,"abc")

    //对list中的数字加1，忽略字符串

    val list1: List[Int] = list.collect{case i : Int => i+1}

    println(list1)

  }
}
