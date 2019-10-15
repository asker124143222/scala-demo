object Ex_function2 {
  def main(args: Array[String]): Unit = {

    //可变参数,在声明类型后面加一个星号表示
    def test(names : String*): Unit = {
      println(names)

      if(names.length>0)
        println(names.apply(0))

      for (s <- names){
        println(s)
      }
    }

    test("tom","jerry","wolf")
    test()


    //默认参数
    def test2(name : String,age : Int = 20): Unit ={
      println(s"${name} -- ${age}")
    }

    test2("tony")
    test2("mark",4)

    //带名参数
    test2("toy",age=10)
  }
}
