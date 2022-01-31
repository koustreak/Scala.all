object anonymous {

    val func = (x:Int) => x+100

    val sum = (x:Int,y:Int) => {
        x+y
    }:Int

    def main(args: Array[String]) : Unit ={
        println(func(10))
        println(sum(10,2))
    }
}
