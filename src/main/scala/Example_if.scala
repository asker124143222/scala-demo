/**
  * @Author: xu.dm 
  * @Date: 2019/9/13 19:02 
  * @Description:
  *
  */
object Example_if {
  def main(args: Array[String]): Unit = {
    val s1 = "abc"
    val s2 = "abc"
    val n1 =1000
    val n2 = 3000

    val s = if(s1.equals(s2)){
      n1+n2
    }else{
      n2-n1
    }
   println(s);
  }


}
