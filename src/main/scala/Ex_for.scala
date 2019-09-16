import scala.util.control.Breaks

/**
  * @Author: xu.dm 
  * @Date: 2019/9/13 19:55 
  * @Description:
  *
  */
object Ex_for {
  def main(args: Array[String]): Unit = {

    //全闭合，包括1-10
    println("全闭合，包括1-10")
    for (i <- 1 to 10) {
      println(i)
    }

    println("\n1-10左闭右开")
    //左闭右开
    for (i <- 1 until (10)) {
      println(i)
    }

    println("\n左闭右开,步长为2")
    //有步长
    for (i <- 1 until(10, 2)) {
      println(i)
    }

    println("scala实现九层妖塔，字符串可以乘数字")
    for (i <- 1.until(18, 2)) {
      println(" " * ((18 - i) / 2) + "*" * i + " " * ((18 - i) / 2))
    }

    //第二种写法
    for (i <- Range(1, 18, 2)) {
      val j = (18 - i) / 2
      println(" " * j + "*" * i + " " * j)
    }

    //第三种写法
    for (i <- Range(1, 18, 2); j = (18 - i) / 2) {
      println(" " * j + "*" * i + " " * j)
    }

    //第四种写法
    for {i <- Range(1, 18, 2)
         j = (18 - i) / 2} {
      println(" " * j + "*" * i + " " * j)
    }

    //to 和 until 本质是调用Range
    for (i <- Range(1, 10, 2)) {
      println(s"i=${i}")
    }

    println("continue语法")
    //循环守卫
    //就是if条件成立执行循环体，否则跳过本次循环体 类似java的continue语法
    for (i <- 1 to 5 if i % 2 == 0) {
      println(s"i=${i}")
    }

    println("实现break")
    //实现break
    //通过静态类型引入，引入"import scala.util.control.Breaks._"后，可以省略半生类Breaks
    Breaks.breakable{
      for (i <- Range(1, 10, 2)) {

        if(i==5){
          Breaks.break()
        }

        println(s"i=${i}")
      }
    }


    println("for循环返回值")
    //默认情况下，for循环返回值为()
    val unit = for(i<-1 to 3) {
      "abc"
    }
    println(unit)

    //特殊情况，使用yield关键字可以把每一次循环的结果存到集合中返回。
    val result = for(i<-1 to 10) yield i * 2
    println(result)

  }
}
