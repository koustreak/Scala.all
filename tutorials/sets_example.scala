import scala.collection._

object sets_example {
    // default is immutable sets
    // for mutable sets . scala.collection.mutable._
    // if you need both immutable and mutable sets you need mutible.Set
    def main(args: Array[String]) : Unit = {
        var chars = Set(1,2,3,4)
        var empt = Set()
        var chars2 = Set(1,2,7)

        println(empt.isEmpty)
        println(chars++empt)

        println(chars.head)
        println(chars.tail)

        println(chars++chars2)

        println(chars&chars2)
        println(chars&~chars2)

        println(chars-2)
        println(chars.contains(4))

        println(chars.addString(new StringBuilder(),"*"))

        println(chars.init)
        println(chars.last)
    }

}
