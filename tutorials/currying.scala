class curr {
    def sum(a: Int) (b:Int) = {
        a+b
    }
}

object currying {
  def main(args: Array[String]) : Unit = {
    var x = new curr
    println(x.sum(10)(12))
  }
}
