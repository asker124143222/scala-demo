import scala.beans.BeanProperty

//伴生对象（静态）
//伴生对象可以访问伴生类的私有属性
//伴生对象可以使用apply创建伴生类的对象
object Student {
  def apply: Student = new Student()

  def apply(name : String): Student = new Student(name)
  def apply(name : String,password : String): Student = new Student(name,password)


}

//伴生类（成员）
class Student {
  var name : String = _
  private var password : String = _
  //@BeanProperty注解标识类变量为bean对象，并自动生成getter和setter方法
  @BeanProperty var address : String = _

  def this(name : String)={
    this()
    this.name = name
    this.password = "123456"
  }

  def this(name : String,password:String)={
    this()
    this.name = name
    this.password = password
  }

  def printAll ={
    println(this)
    println(s"student -> name:${name}, ->password:${password},->address:${address}")
  }
}
