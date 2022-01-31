class whileloops(var x:Int) {
  while (x<10){
      println("Value of x is "+x)
      x = x+1
  }
}

class dowhileloops(var x:Int) {
    do {
        println(x)
        x = x+1
    }while (x<10)
}

class forloops(var x:Int) {
    // 1 to 10 means , all from 1 to 11
    // 1 untill 10 means 
    for (x<- 1 to 11 by 1){
        println(x)
    }
    println("--------------------------------------")
    for (x<- 1 until 11 by 1){
        println(x)
    }
    println("--------------------------------------")
    for (x<- Array.range(1,11,1)){
        println(x)
    }
    println("--------------------------------------")
    for (x<- List.range(1,11,1)){
        println(x)
    }
    println("--------------------------------------")
}

class nestedloops(var x:Int) {
    // 1 to 10 means , all from 1 to 11
    // 1 untill 10 means 
    var b = 5
    for (x<- 1 to 11 by 1;b<-x to 5 by 2){
        println(x+"--"+b)
    }
    print("++++++++++++++++++++++++++++++++")
}

class listloop {
    var a = 0
    val numlist = List(1,2,3,4,5,6,7,8,9)
    for (a<-numlist if a!=6;if a<8){
        println(a)
    }
    println("++++++++++++++++++++++++++++++++")
}

class loopretvalue {
    var a = 0
    val numlist = List(1,2,3,4,5,6,7,8,9)
    var retval = for{ a<- numlist if a!=3;if a<8} yield a
    println(retval)
    println("++++++++++++++++++++++++++++++++")
}

object demo {
    def main(args: Array[String]): Unit = {
        var obj = new loops(1)
        var obj1 = new dowhileloops(11)
        var obj2 = new forloops(11)
        var obj3 = new nestedloops(11)
        var obj4 = new listloop()
        var obj5 = new loopretvalue()
    }
}