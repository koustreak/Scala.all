object iterators {
    def main(args: Array[String]) : Unit = {
        var iters = Iterator(1,2,3,5)
        var iters1 = Iterator(11,22,33,5)
        println(iters.next())
        while (iters.hasNext){
            println(iters.next())
        }
        println(List(iters++iters1))
        println(iters.addString(new StringBuilder(),"*"))

        println(iters.buffered)
        println(iters.contains(11))
    }
}