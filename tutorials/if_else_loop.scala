class if_else_loop {
  
}

object demo {
    def main(args: Array[String]) : Unit = {
        var scanner = new java.util.Scanner(System.in)
        println("Enter the values ")
        println("Enter the value of a -> ")
        var a : Double = scanner.nextDouble()
        println("Enter the value of b -> ") 
        var b : Double = scanner.nextDouble()
        println("Enter the value of c -> ") 
        var c : Double = scanner.nextDouble()
        println("Enter the value of x -> ") 
        var x : Double = scanner.nextDouble()

        var d: Double = a*b+c*x
        println("end result "+d)

        if (d<2.0) {
            println("Yes")            
        }
        else if (d>2.0) {
            println("No1")            
        }
        else {
            print("No")
        }

        x = if (a!=0) x/a else 0.5
        println("New value of x "+x)
    }
}
