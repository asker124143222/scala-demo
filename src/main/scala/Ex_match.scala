object Ex_match {
  def main(args: Array[String]): Unit = {
    val oper = "+*"
    val n1 = 10
    val n2 = 20
    var res = 0
    oper match {
      case "+" => res = n1+n2
      case "-" => res = n1-n2
      case "*" => res = n1*n2
      case "+*" => {
        res = n1 + n2
        res = res * res
      }
      case _ => println("error operator") //缺省分支
    }
    println(res)


    //第二例子
    for (ch <- "+-3!"){
      var sign = 0
      var digit = 0
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        case _ if ch.equals("3") => digit =3  //有条件的放前面
        case _ => sign =2
      }
      println(ch +" "+sign+" "+digit)
    }

    //第三个例子
    //case 后面跟变量名，那么match前的表达式会赋值给变量
    val testString = "my test 123"
    testString match {
      case "+" => println("ok")
      case myString => println("ok -->"+myString)
      case _ => println("ok -->")
    }
  }
}
