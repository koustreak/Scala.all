// singleton object

object BankAccount {
    private var lastnum = 0
    def newNum () = {lastnum += 1; lastnum}
}

object SingletonObject {
    def main(args: Array[String]): Unit = {
        println("newNum calling "+BankAccount.newNum())
        println("newNum calling "+BankAccount.newNum())
        println("newNum calling "+BankAccount.newNum())
        println("newNum calling "+BankAccount.newNum())
    }
}
