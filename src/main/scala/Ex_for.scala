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
    for (i<-1 to 10){
      println(i)
    }

    println("\n1-10左闭右开")
    //左闭右开
    for(i<-1 until(10)) {
      println(i)
    }

    println("\n左闭右开,步长为2")
    //有步长
    for(i<-1 until(10,2)) {
      println(i)
    }
  }
}
