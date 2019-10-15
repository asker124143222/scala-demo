object Ex_generic {
  def main(args: Array[String]): Unit = {

    test01(new UserGeneric)

    test02(new Child)

    test02(new UserGeneric)
//    test02(new PersonGeneric) //runtime报错


    //正常情况
    val test04 : TestGeneric[UserGeneric] = new TestGeneric[UserGeneric]
    println(test04)

    //协变
    val test05 : TestGeneric01[UserGeneric] = new TestGeneric01[Child]
    println(test05)


    //逆变
    val test06 : TestGeneric02[UserGeneric] = new TestGeneric02[PersonGeneric]
    println(test06)
  }

  //泛型，用中括号表示
  def test01[T](t : T): Unit ={
    println(t)
  }

  // <: 表示泛型上限，传入的参数应该为单前类或子类
  def test02[T <: UserGeneric](t:T): Unit ={
    println(t)
  }

  // >: 表示泛型下限，传入的参数理论上应该为单前类或子类，实际从反编译的代码看，是什么类型都可以传
  def test03[T >: UserGeneric](t:T): Unit ={
    println(t)
  }
}


class PersonGeneric {

}

class UserGeneric extends PersonGeneric{

}

class Child extends UserGeneric{

}

class TestGeneric[UserGeneric] {

}

//添加一个加号表示协变,创建时可以使用子类
class TestGeneric01[+UserGeneric] {

}

//添加一个减号表示逆变,创建时可以使用父类
class TestGeneric02[-UserGeneric] {

}