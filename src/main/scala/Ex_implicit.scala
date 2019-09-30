object Ex_implicit {
  def main(args: Array[String]): Unit = {
    //定义自定义隐式转换
    //隐式转换的方法名是不重要的，主要是方法参数和返回值，scala自动调用隐式方法
    implicit def transform(d:Double) : Int={
      d.toInt
    }

    //使用自定义隐式转换
    val num : Int = 3.5
    println(num)
  }
}
