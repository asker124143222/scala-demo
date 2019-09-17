object Ex_funcation3 {
  def main(args: Array[String]): Unit = {
    def test(): Unit = {
      println("--->test")
    }

    //TODO 返回一个函数本身，而不是执行函数；通过在函数后面加一个下划线实现
    def test2() = {
      test _
    }

    //返回的是函数test()本身
    test2()

    //通过test2()返回test(),然后通过()执行test()，返回test()的执行结果
    test2()()


    def test3() = {
      //执行了test()函数
      test
    }

    test3()


    //TODO 闭包，f1的i作为外部参数被内部函数f2引入(注意：不是作为参数传入，而是直接引用)，
    // f1函数参数i脱离了原本的生命周期.
    // 闭包(外部环境持有内部函数所使用的自由变量，对内部函数形成“闭包”)
    def f1(i: Int) = {
      def f2(j: Int): Int = {
        i * j
      }

      f2 _
    }

    println(f1(2)(3))

    //TODO 函数柯里化，简化f1,f2函数嵌套
    def f3(i: Int)(j: Int) = {
      i * j
    }

    println(f3(2)(4))
  }

  //todo 将函数作为参数传递给另外一个函数
  // 函数的声明格式为： ()=>Int 表示：()括号表示参数列表,如果有参数在在括号里写类型，Int表示返回类型,=>是声明方式
  def f4(f: (Int, Int) => Int, step: Int): Int = {
    val i = 10

    f(i, step)
  }

  def f5(i: Int, j: Int): Int = {
    i * j
  }
  //将函数f5作为参数传入到函数f4中
  println(f4(f5, 4))

  //匿名函数方式调用f4
  println(f4((x,y)=>{x*y},4))
}
