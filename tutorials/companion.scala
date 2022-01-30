// how companion class works 

object account {
    private var num : Int = 0
    private def getNewAccNum() = {num+=1;num}
}

class account {
    val id = account.getNewAccNum()
    private var balance = 0.0
    def deposite(amount:Double) = {balance+=amount;balance}
    def balanceEnquiry() = balance  
}

object companion {
    def main(args: Array[String]): Unit = {
        var obj1 = new account()
        println("Current account Id "+obj1.id)
        var xx =obj1.deposite(10000)
        var bal : Double = obj1.balanceEnquiry()
        println("Balance is "+xx)
    }
}