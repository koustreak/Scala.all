import Array._

object array_example {
    def main(args: Array[String]) : Unit = {
        var arr = new Array[Int](4)
        for (i<-0 until 4) {
            arr(i) = i
        }      
        println(arr)
        for (i<-arr){
            println(i)
        }

        var arr1 = Array(10,20,30,40)
        var arr2 = Array(11,22,33,44)
        println(concat(arr1, arr2))

        var arr3 = range(2,15,2)
        println(arr3)

        var arr4 = ofDim[Int](3,3)
        for (i<- 0 to 2){
            for (j<-0 to 2){
                arr4(i)(j) = {i+j}
            }
        }

        println(arr4)
  }
}