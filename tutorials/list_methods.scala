object list_methods {
    def main(args: Array[String]) : Unit = {
        // lists example - lists are immutable objects
        var city : List[String] = List("kolkata","delhi","mumbai")
        println(city)
        println(city:+"ak")
        println("patna" :: city)
        println(city.addString(new StringBuilder()))
        println(city.addString(new StringBuilder(),"*"))
        println(city.apply(1))
        println(city.contains("kolkata"))
        var arr : Array[Any] = Array(0,0,0,0,0)
        city.copyToArray(arr,0,2)        
        for(a<-arr){
            println(a)
        }

        println(List(1,2,2,4).distinct)
        println(city.drop(1))
        println(city.dropRight(1))
        
        println(city)
        println(city.endsWith(Seq("mumbai")))

        println(city.equals(Seq("delhi")))
        println(city.exists(_ == "delhi"))
        println(city.filter(_.length > 1))

        println(city.forall(_.length>1))
        var xy = city.foreach(_ + "xp")
        println(xy)
        println(city.indexOf("kol",0))
        println(city.intersect(Seq("Kolkata")))
        println(city.isEmpty)

        println(city.iterator)
        println(city.map(_+"xp"))

        println(city.max)
        println(city.min)

        println(city.reverse)
        println(city.mkString)
        println(city.mkString("//"))

        println(city.toArray)
        println(city.toSeq)
        println(city.toString)

        println(city.toMap)
    }
}
