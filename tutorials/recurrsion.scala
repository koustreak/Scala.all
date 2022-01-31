object recurrsion {
    def fact(n:Int):Double = {
        if (n==1) {
            return 1
        }
        n*fact(n-1)
    }

    def main(args: Array[String]):Unit = {
        var scanner = new java.util.Scanner(System.in)
        println("Enter number ")
        var a = scanner.nextInt()
        println(fact(a))
    }
}
