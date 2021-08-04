package example

object Main extends App {
  println("hello")
  val adder = new Adder(1)
  val sum = adder.plus(2)
  println(s"sum: $sum")
}
