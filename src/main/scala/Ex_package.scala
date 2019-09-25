


import java.util.Date
// import 可以采用特殊的方式来隐藏指定的类:{类名=>_}
import java.sql.{Date=>_}
// {类名=>_}使用非下划线给类起一个别名，防止和其他类名冲突
import java.util.{HashMap=>JavaHashMap}

object Ex_package {
  def main(args: Array[String]): Unit = {
    val date = new Date()
    println(date)

    val map  = new JavaHashMap[String,String]()
    map.put("1","a")
    map.put("2","b")

    println(map)
  }
}
