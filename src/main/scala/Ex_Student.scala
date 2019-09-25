object Ex_Student {
  def main(args: Array[String]): Unit = {
    //直接使用类名构造的是Student的类型（type）对象
    // apply构造的是类对象，两者不是一回事，注意视频教程里这个地方讲错了
    // 从打印出来的对象可以查看类型对象多了一个$符号
    val student = Student
    val student2 = Student.apply
    val student3 = Student("tom")
    val student4 = Student.apply("amy","eee")
    student4.setAddress("beijing road 1212")
    student4.name = "amy updated"
    val student5  = student.apply

    println(s"student:${student}")
    println(s"student2:${student2}")
    println(s"student5:${student5}")



//    student.printAll  没有这个方法，因为student只能使用伴生对象中的方法（因为是静态的）
    student2.printAll
    student3.printAll
    student4.printAll
    student5.printAll
  }
}
