object Ex_match3 {
  def main(args: Array[String]): Unit = {
    //特殊的模式匹配
    val (x,y) = (1,2)
    println(x +" , "+y)

    val (userName,age,email)=("zhangsan",20,"abc@123.com")
    println(s"userName:${userName},age:${age},email:${email}")

    //多个运算符
    val tuple: (BigInt, BigInt) = BigInt(10) /% 3
    println(tuple)

    val (q,r) = BigInt(10) /% 3
    println(q+" , "+r)

    //循环
    val list = List(("a",1),("b",2),("c",3))
    for(elem<-list){
      println((elem._1+" = "+elem._2))
    }

    for((k,v)<-list){
      println(k+" = "+v)
    }
  }
}
