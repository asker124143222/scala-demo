/**
  * @Author: xu.dm 
  * @Date: 2019/9/8 11:19 
  * @Description:
  *
  */
object Hello {
  def main(args: Array[String]): Unit = {

    val name = "zhangsan"
    val age = 30
    val salary = 6700f

    //字符串输出以及格式化
    println("名字："+name+" 年龄："+age+" 薪水："+salary)
    printf("名字：%s 年龄：%d 薪水：%.2f\n",name,age,salary)
    println(s"名字：${name} 年龄：${age} 薪水：${salary}")
    println(f"名字：${name} 年龄：${age}%.2f 薪水：${salary}%.4f")
    println(raw"名字：${name} 年龄：${age}%.2f 薪水：${salary}%.4f")


    //变量var可以重新new，变量val不可以重新new
    var dog = new Dog()
    dog.name = "tom"

    println(dog)
    println(dog.name)

    dog = new Dog()
    dog.name = "wancai"
    println(dog)
    println(dog.name)

    var a = 10
    var b = 20
    println("a="+a+" b="+b)
    //交换ab
    a = a+b //30
    b = a-b //10
    a= a - b //20
    println("a="+a+" b="+b)

    //交换ab
    a = a^b //30
    b = a^b //10
    a= a ^ b //20
    println("a="+a+" b="+b)


  }
}

class Dog{
  var name = "";
}
