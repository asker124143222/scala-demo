object Ex_trait3 {
  def main(args: Array[String]): Unit = {
    val mysql  = new MySql2()

    println(mysql.insert())
  }
}

//特质可以继承类
//trait Operate2 extends Exception{
trait Operate2 {

  //表示这个特质的使用范围是有异常的，混入这个特质的类需要继承Exception
  this:Exception =>
  def insert() {
    println("插入数据")
    throw new Exception("插入数据异常。。。")
    this.getMessage
  }
}


//class MySql2 extends Operate2{
class MySql2 extends Exception with Operate2 {

}
