object Ex_construction2 {
  def main(args: Array[String]): Unit = {
    val user = new User()
    val user1 = new User("tony")
    val user2 = new User2("tom")
    val user3 = new User3("amy")
    println(user3.userName)
  }
}


class Person2(name : String){
  println(s"person 主构造方法，参数:${name}")

  def this(){
    this("parent")
  }
}

//如果父类造方法有参数，子类也必须显式调用父类构造方法
//如果父类构造方法有多个，子类调用任意一个即可
class User(userName : String) extends Person2(){
  println(s"user 主构造方法：参数:${userName}")

  def this(){
    this("test name")
  }
}

class User2(userName : String) extends Person2(userName){
  println(s"user 主构造方法：参数:${userName}")

  def this(){
    this("test name")
  }
}

//将构造函数里参数声明为var或者val以后，参数就会变成成员属性，可以被类对象引用
class User3(var userName : String) extends Person2(userName){
  println(s"user 主构造方法：参数:${userName}")

  def this(){
    this("test name")
  }
}