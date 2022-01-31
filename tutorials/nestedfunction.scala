class nestedfunction {
    def outer(): Unit ={
        println("inside outer")
        def inner () : Unit = {
            println("Inside inner")                
        }
        inner()
    }    
}

object obj {
    def main(args : Array[String]): Unit = {
        var obj = new nestedfunction
        obj.outer()
    }
}
