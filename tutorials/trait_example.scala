trait trait_example {
    def isEqual(x:Any):Boolean
    def isNotEqual(x:Any):Boolean = !isEqual(x)
}

class ddx (xc:Int,yc:Int) extends trait_example{
    var x = xc
    var y = yc

    def isEqual(obj: Any) = {
        obj.isInstanceOf[ddx] && obj.asInstanceOf[ddx].x == x
    }
}

object trt {
    def main(args: Array[String]) : Unit = {
        val p1 = new ddx(1,2)
        val p2 = new ddx(2,3)

        println(p1.isNotEqual(p2))
    }
}
