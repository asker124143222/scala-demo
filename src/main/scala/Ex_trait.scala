object Ex_trait {
  def main(args: Array[String]): Unit = {
    new User4()
    println("")
    val user = new User5()
    user.hellAll()
  }
}

// trait 是特质
//trait 类似java的interface
// 特质与接口不同的地方是，特质有方法实现（jdk8以后，Java也可以），函数，变量
//java 接口中只有常量，即需要用final static修饰
trait HelloTrait{
  var userName : String
  println("Hello trait ...")
  def hellAll()
}

class Person4 {
  println("person4 ...")
}

//使用with 连接（混入）trait（接口）
//trait 只和单前类有关系（和接口一样），和父子类没有关系，接口不会传递，接口的方法可以从父类继承
//父子类可以进行多态传递
//如果类没有继承父类，那么混入特质的第一个关键字是extends,其他多个特质用with，
// 如果有父类，父类用extends紧跟子类，特质用关键字with
// 特质的变量可以重写，特质的变量可以是抽象的（即没有初始化），java接口不可以
class User4 extends Person4 with HelloTrait {

  println("user4 ...")

  override var userName: String = "user4"

  override def hellAll(): Unit = {
    println("override trait hellAll...")
  }
}

//trait只会初始化一次
class User5 extends User4 {
  println("user5")
}