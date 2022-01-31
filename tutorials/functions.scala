object functions {
    def testfunc():Unit = {
        println("Test Functions ")
    }

    def retzero():Int = {
        return 100
    }

    // without return type
    def withoutrettype() = {
        println("OMG")
    }

    //named arguments scala functions
    def custom(a:Int , b:Int) : Unit = {
        println(s"val of a is $a"+s"val of b is $b")
    }

    // variable arguments scala functions 

    def sum(args: Int *) : Int = {
        var result = 0
        for (a<-args) {
            result += a
        }
        result
    }

    def main(args: Array[String]): Unit = {
        testfunc()
        println(retzero())
        withoutrettype()
        custom(11,12)
        println(sum(1,2,3,4,5))
    }
}
