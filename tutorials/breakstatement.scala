
// import break 

import scala.util.control._

object breaks {
    def main(args: Array[String]): Unit = {
        var a = 0;
        val numlist = List(1,2,3,4,5,6,7,8,9)
        var loop = new Breaks;
        loop.breakable {
            for (a<-numlist){
                println(a)
                if (a==7){
                    loop.break
                }
            }            
        }
        println("Loop broken")
        println("Initiate nested loop break") 
        var b = 0
        val numlist1 = List(11,22,33,44,55,66,77,88,99)
        var inner = new Breaks
        var outer = new Breaks
        outer.breakable {
            for (b<-numlist1){
                println(b)
                inner.breakable {
                    for (a<- numlist){
                        println(a)
                        if (a==6) {
                            inner.break
                        }
                    }
                }
                if (b==33) {
                    outer.break
                }
            }
        }
        // infinite loop 
        while (true) {
            println("infinite loop in scala")
        }
    }
}