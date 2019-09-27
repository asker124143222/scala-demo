

object Ex_class {
  def main(args: Array[String]): Unit = {
    //classOf[T]获取类信息
    val userClass = classOf[UserClass]
    println(userClass.getInterfaces.length)

    //type关键字是给类取别名
    type MyUser = UserClass
    val user = new MyUser
    val user2 = new UserClass
    user.id = 11
    user2.id = 10
    println(user.equals(user2))

    user.id = 10
    user2.id = 10

    println(user.equals(user2))

  }
}

class UserClass extends Operate {
  var id: Int = _
  var userName: String = _
  println("UserClass Object...")

  override def equals(obj: Any): Boolean = {
    //判断类型
    if (obj.isInstanceOf[UserClass]) {
      //转换类型
      val otherUser = obj.asInstanceOf[UserClass]
      this.id == otherUser.id
    } else {
      false
    }

  }
}
