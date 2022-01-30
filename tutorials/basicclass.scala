// a basic scala class
class basicclass (var xc: Int, var yc: Int) {
    def display() : Unit = {
        println("value of xc is "+xc)
        println("value of yc is "+yc)
    }
}

object basicObject {
    def main(args: Array[String]) : Unit = {
        var obj = new basicclass(10,10)
        obj.display()
        obj = new basicclass(10,20)
        obj.display()
    }
}

// using var helps me to reassign the value to same object 
// using val will give immutability on this 