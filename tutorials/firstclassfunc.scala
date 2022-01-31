// methods where functions as a parameter 
// methods returning a function 
// functions stored in a variable


object firstclassfunc {

    def methods(value : Int,func : ()=>Unit): Double = {
        var x = value
        x+=100
        func()
        return x
    }

    val functions = () => {
        println("Hey")
    }:Unit

    def main(args: Array[String]): Unit = {
        println(methods(500,functions))
        //functions()
    }
}
