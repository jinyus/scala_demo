import os._

object Main {
  def main(args: Array[String]): Unit =
    val jsonContent = os.read(os.pwd / "input.txt")
    println(s"Content length: ${jsonContent.length}")
}
