object match1 {
    
    def main(args: Array[String]) : Unit = {
        println(demo(7))
        val alice = new Person("alice",25)
        val ppx = new Person("pkl",20)
    }

    def demo(x:Any) : Any = x match {
        case 1 => "One"
        case 2 => "two"
        case y: Int => "Int"
        case _ => "many"
    }

    final case class Person(x1:Int,x2:Int)
}