import Array._

object lists_example {
    def main(args: Array[String]) : Unit = {
        // lists example - lists are immutable objects
        var fruits : List[String] = List("mango","oange","pears")
        var empty :List[Nothing] = List()
        var dim : List[List[Int]] = List(
            List(1,2,3),
            List(4,5,6),
            List(7,8,9)
        )
        println(fruits)
        println(empty)
        println(dim)

        var fruits2 = "apple"::("orange" :: ("mango"::Nil))
        var nums = "t1"::("t2"::("t3"::Nil))
        dim = (1::(2::(3::Nil)))::(11::(12::(13::Nil)))::Nil
        println(fruits2,nums,dim)

        //operations
        var nillist = Nil
        println("Head of the list is "+fruits2.head)
        println("Tail of the list is "+fruits2.tail)
        println(fruits2.isEmpty)
        // concatenate the lists

        println(fruits2::nums)

        println(List.fill(3)("apples"))
        println(List.fill(10)(2))

        // list tabulation functions
        println(List.tabulate(6)(n=>n*n))
        println(List.tabulate(2,3)(_+_))

    }
}