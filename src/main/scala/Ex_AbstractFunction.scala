object Ex_AbstractFunction {
  def main(args: Array[String]): Unit = {

    //函数作为参数传递给另外一个函数时，如果这个函数不需要参数，也不需要返回值，那么可以直接传递一段代码逻辑
    //函数作为参数声明方式应该时 类似 op:()=>Unit，如果没有参数和返回值可声明为op: => Unit
    //调用的时候用大括号可以直接写逻辑代码在函数中
    //抽象控制
    def test(op: => Unit): Unit ={
      op
    }

    test{
      println("print something ... ")
    }
  }
}
