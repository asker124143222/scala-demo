object Ex_construction {
  def main(args: Array[String]): Unit = {
    val user1 = new UserInfo()
    val user2 = new UserInfo("tom", "123")
    user1.printAll
    user2.printAll

    println("----------------")
    val man =new RichMan()
    val man2 =new RichMan("jerry",10)
    man.sayHello()
    man2.sayHello()
  }
}


//todo 类有两种构造方法，写在类名后面的参数列表代表主构造方法
// 放在类体里的构造方法是辅助构造方法
// 辅助构造方法里必须调用主构造方法
// 辅助构造方法必须用this来指定
// 辅助构造方法里如果调用其他构造方法，其他构造方法必须放前面声明
class UserInfo(name: String) {
  var userName: String = name
  var password: String = _
  var address: String = _

  def this()  {
    this("")
  }

  def this(name: String, password: String) {
    this(name)
    this.password = password

  }

  def printAll {
    println(s"UserInfo:${this},-->userName:${userName},-->password:${password},-->address:${address}")
  }
}


abstract class Person {
  //抽象类可以不定义变量初始值
  var name : String
  var age : Int

  var email = "example@abc.com"

  //抽象方法，没有实现体
  def sayHello()

  def printEmail(): Unit ={
    println(email)
  }
}

class RichMan extends Person{

  override var name: String = _
  override var age: Int = _

  def this(name : String,age : Int){
    this()
    this.name = name
    this.age = age
  }

  //override重写关键字在补全抽象方法的时候可以省略，在重写方式的时候不能省略
  override def sayHello() {
    println(this.name + " "+this.age)
  }

  override def printEmail(): Unit = super.printEmail()
}