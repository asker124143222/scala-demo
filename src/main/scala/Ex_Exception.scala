object Ex_Exception {
  def main(args: Array[String]): Unit = {
    try {
      val x = 10
      val y = 0
      val z = x / y

      println(z)
    } catch {
      case e: ArithmeticException => println("ArithmeticException..." + e.getMessage)
      case e: Exception => println("Exception..." + e.getMessage)
    }
    finally {
      println("finally...")
    }
  }
}
