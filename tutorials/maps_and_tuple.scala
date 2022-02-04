object maps_example {
    def main(args: Array[String]) : Unit = {
        var a : Map[String, String] = Map()
        var b = Map(1->2,2->3,3->4)
        var c = Map(1->2,2->3,3->6,11->12)
        b+=(4->5)
        println(a,b)
        println(a.keys)
        println(b.values)
        println(a.isEmpty)
        println(b++c)

        var t = (2,"a",11.20)
        //access the elements of tuple 
        println(t._1)
        println(t._2)
        // tuple starts from 1 as index

        // access tuple elements
        t.productIterator.foreach {
            i=>println(i+"a")
        }
        
        var str = t.toString()
        println(str)
    }
}
