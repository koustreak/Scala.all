object options_example {
    def main(args: Array[String]) : Unit = {
        val caps = Map("France"->"Paris","India"->"Delhi")
        println(show(caps.get("India")))
        println(show(caps.get("Pakistan")))

        var a:Option[String] = None
        var b:Option[Int]=Some(10)
        println(a.isEmpty)
        println(b.isEmpty)
        println(a.getOrElse(10))
        println(b.getOrElse("a"))
    }

    def show(x: Option[String]) = x match {
        case Some(s)=>s
        case None => "?"
    }


}
