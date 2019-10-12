package learn.caseclass

object Test {
  def main(args: Array[String]): Unit = {
      printTerm(Var("abc"))
    printTerm(App(Var("a"),Var("b")))

  }
  def printTerm(term: Term): Unit ={
    term match {
      case Var(n) => print(n)
      case Fun(x,b) => printTerm(b)
      case App(f,v) => printTerm(f)
    }
  }
}

