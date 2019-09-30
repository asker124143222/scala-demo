object Ex_implicit3 {
  def main(args: Array[String]): Unit = {


    //通常的函数是这样，可以有缺省值
    def test(name : String = "tom")={
      println(s"Hello ${name}")
    }

    //采用缺省值的调用方式
    test()
//    test  //报错

    def test2(implicit name : String = "amy")={
      println(s"Hello ${name}")
    }

    //有括号，调用的是带默认参数的test2
    test2()

    //隐式值，test2函数里的隐式调用被自动替换
    implicit val userName = "jerry"

    //不加括号，执行隐式转换
    test2

  }
}
