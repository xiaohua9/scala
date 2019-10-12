package learn.caseobject

object Rols {
  case object xiaoming
  case object analyst
  case object developer
}

object aa{
  def main(args: Array[String]): Unit = {
    println(Rols.xiaoming)
    print(Rols.developer)
  }
}
