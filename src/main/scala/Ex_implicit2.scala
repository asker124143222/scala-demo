package com.home.Ex_implicit2

object Ex_implicit2 {
  def main(args: Array[String]): Unit = {

    //自定义隐式转换将Mysql对象转换成Operate对象
    implicit def transform(mySql: Mysql) : Operate={
      new Operate
    }

    val mysql = new Mysql
    mysql.select()

    //这个步骤经过隐式转换，可以调用Operate的方法
    mysql.delete()

  }
}

class Operate(){
  def delete(): Unit ={
    println("执行Operate的delete方法")
  }
}


class Mysql {
  def select(): Unit ={
    println("执行mysql的select方法")
  }
}
