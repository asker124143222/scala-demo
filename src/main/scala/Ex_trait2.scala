object Ex_trait2 {
  def main(args: Array[String]): Unit = {
    val mysql = new Mysql()
    mysql.insert()

    println("---------------")

    //动态混入特质
    val oracleSql = new OracleSql() with File
    oracleSql.insert()
  }
}

trait Operate{
  println("Operate...")

  def insert(): Unit ={
    println("插入数据")
  }
}

trait DB extends Operate{
  println("DB...")

  override def insert(): Unit = {
    print("向DB")
    super.insert()
  }
}


trait File extends Operate{
  println("File...")

  override def insert(): Unit = {
    print("向文件")
    super.insert() //指向上一层特质，类混入的时候，从右到左，即从下到上依次类推
//    super[Operate].insert() //指向父特质Operate
   }

}

//特质执行顺序为从左到右，实际上就是特质的初始化顺序
//特质里的方法是从右到左，实际上就是继承的最末端（最子类先执行）先执行
//缺省情况下super指向上一层特质，不一定是父特质，如果要指向父特质语法为:super[父特质]
class Mysql extends DB with File{

}

class OracleSql {
  println("Oracle")
}