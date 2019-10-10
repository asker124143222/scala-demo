import scala.io.Source

object WordCountFromFile {
  def main(args: Array[String]): Unit = {
    val lineList: List[String] = Source.fromFile("in/input1.txt").getLines().toList

    val countList: List[(String, Int)] = lineList.flatMap(s => s.split(" "))
      .groupBy(s => s)
      .toList.map(t => (t._1, t._2.size))
      .sortWith((x, y) => {
        x._2 > y._2
      })
    println(s"lineList = ${lineList.mkString(",")}")
    println("word count = "+countList.mkString(","))
  }
}
