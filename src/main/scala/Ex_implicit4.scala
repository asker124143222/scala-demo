object Ex_implicit4 {
  def main(args: Array[String]): Unit = {
    val user = new User
    user.select()
    user.delete()

  }

  class User{
    def select(): Unit ={
      println("user..select()")
    }
  }

  //隐式类，需要提供一个且只有一个参数，作为转换的输入
  //隐式类不能是顶级类
  implicit class Person(u:User){
    def delete()={
      println("person..delete()")
    }
  }
}
