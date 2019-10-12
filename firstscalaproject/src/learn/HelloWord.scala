package learn

object HelloWord {
  def main(args: Array[String]): Unit = {
    println(foo(10,12))
    val pattern="(\\d)".r
    "a" match {
      case pattern(n) => print(n)
      case _ => println("error")
    }

    val str = "[0-9]+".r.replaceAllIn("12 3 d djkl","1")
    val str1 = "[0-9]+".r.findAllIn("12 3 d djkl")
    println(str1.next())
  }
  def foo(n:Int,v:Int)=for (i <- 0 to n;j <- i to n;if(i+j==v) )yield (i,j)
}
