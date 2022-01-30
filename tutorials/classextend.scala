// basic inheritence .
// extend a base class , 
// only the primary constuctor can pass to the base class 
class point2(val xc: Int,val yc: Int) { // primary constuctor 
    println("point2 starting")

    var x : Int = xc
    var y : Int = yc 

    def display(cmt : String): Unit = {
        println("Old Value of xc is "+xc+" Value of yc is "+yc)  
        print("Comment is "+cmt)      
    }

    def move(dx: Int,dy: Int) : Unit = {
        x += dx
        y += dy
        println("New value of x,y is "+x+","+y)   
    }
}

class point3 (override val xc: Int,override val yc: Int,val zc: Int) extends point2(xc,yc) {    

    var z : Int = zc

    def move(dx: Int,dy: Int,dz: Int) : Unit = {
        move(dx,dy)
        z += dz
        println("New value of z is "+z)
    }    
    override def display(cmt: String) : Unit = {        
        println("z = "+z)
    }
}

object obj {
    def main(args: Array[String]) : Unit = {
        var obj1 = new point3(10,20,30)
        obj1.move(10,20,30)
        obj1.display("Nill")
    }
}

