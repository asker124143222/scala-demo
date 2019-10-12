object Ex_match2 {
  def main(args: Array[String]): Unit = {
    val a = 5
    val obj =
      if (a == 1) 1
      else if (a == 2) "2"
      else if (a == 3) BigInt(3)
      else if (a==4) Map("a"->1)
      else if (a==5) List((a,1))
      else if (a==6) Array(1,2,3)
      else Nil

    println(obj)

    //类型匹配
    val result = obj match {
      case a : Int => a
      case b : Map[String,Int] => "对象是一个(字符串->整数)的Map"
      case c : Array[Int] => "对象是一个整数数组"
      case e : List[Any] => "对象是一个集合"
      case _ => "nothing"
    }

    println(result)

    //
    val myArrays  = Array(Array(0),Array(1,0),Array(0,1,0),Array(1,1,0),Array(1,1,0,1))
    for (elem <- myArrays) {
      val result = elem match {
        case Array(0) => "0"
        case Array(x,y) => x+" = "+y
        case Array(0,_*) => "以0开头的数组"
        case _ => "不符合匹配项"
      }
      println(s"result : ${result}")
    }

    val myListArray = Array(List(0),List(1,0),List(0,0,0),List(1,0,0))
    for (elem <- myListArray) {
      val result = elem match {
        case 0::Nil => "0"
        case x::y::Nil => x +" and "+y
        case 0::tail => "0 ..."+tail
        case _ => "不符合项"
      }
      println(s"${elem} result = ${result}")
    }

    //对象匹配
    object Square{
      def apply(arg:Double) = arg * arg

      def unapply(arg: Double): Option[Double] = Some(math.sqrt(arg))
    }

    val number = 36.0d
    number match {
      case Square(n) =>println(n)
      case _ => "not match"
    }


  }
}
