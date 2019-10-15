object Ex_function {
  def main(args: Array[String]): Unit = {

    def hello(s : String) :Unit ={
      println("hello "+s)
    }
    hello("zhangsan")

    def test(s:String) : String={
      return s+"..."
    }

    println(test("zhangsan"))
  }

  def test2(): String ={
    return "test 321"
  }

  println(test2())

  def test3() = {
     "test3"
  }

  println(test3())

  def test4 = "test4"

  println(test4)

  //如果没有返回值，可以省略很多东西
  def test5  {
    println("test5")
  }

  println(test5)

  //TODO 匿名函数，拉姆达表达式
  // 用->的表示方式，花括号的内容直接执行
  ()->{println("test6")}

  // todo 匿名函数第二种方式，使用=>，只是声明函数表达式，不执行
  val f: () => Unit = () => {println("test6=>")}

  //执行() => {println("test6=>")}
  f()

}
