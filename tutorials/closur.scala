// clousar can access variables declared outside a function literal
import scala.collection.mutable._
object closur {
    var a = 10
    val ss = (x:String,y:Int) => {
        println(s"$x is $y years old")        
    }
    def myfunc(name:String,age:Int,func : (String,Int) => Unit) : Unit = {
        func(name,age)
    }
    def main(args: Array[String]): Unit = {
        myfunc("Koushik",30,ss)
        val ages = Array(11,2,3)
        var pprinta = (a:Int) => {
            for (a<-0 to 2){
                println(ages(a))
            }
        }
        pprinta(0)
        val printer = (name:String)=>println(s"$name -- $a")
        val names = ArrayBuffer("Amit","Bimal","Amal")
        val func_name = (func:String=>Unit,name:String)=>{
            func(name)
        }
        for (age_ct<-0 to 2){
            func_name(printer,names(age_ct))
        }
    }
}
