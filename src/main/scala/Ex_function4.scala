object Ex_function4 {
  def main(args: Array[String]): Unit = {
    //todo lazy关键字表示惰性加载
    // lazy关键字只能修饰val，不能修饰var
    lazy val res = sum(100,40)
    println("------------")
    println("------------")
    println("------------")
    println("------------")
    println("result: "+res)
  }

  def sum(x:Int,y:Int):Int={
    println("sum()函数已经执行...")
    x+y
  }
}
