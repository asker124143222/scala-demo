object Ex_funcation {
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
}
