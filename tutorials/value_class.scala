trait Printable extends Any {
    def print(): Unit = println(this)
}

class value_class (val abc:Int) extends AnyVal with Printable 

object trts {
    def main(args: Array[String]) : Unit = {
        val w = new value_class(11)
        w.print()
    }
}
