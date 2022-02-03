object myobj {
    var mycity: String = "Calcutta"
    def main(args: Array[String]) : Unit = {
        println(mycity)
        println("length of city "+mycity.length())
        println("Concatenation")
        println(mycity.concat(" University"))
        println(s"formatted string $mycity")
        var x = 111
        println(f"x = $x%d")
        println(f"x = $x%2d")
        println(f"x = $x%3d")
        // format specifier
        println("Using raw string")
        println(raw"Hellow \n World")
        // charAt method
        println(mycity.charAt(2))
        println("university".compareTo(mycity))
        println("university".compareToIgnoreCase(mycity))
        println("university".equals(mycity))
        println("university".equalsIgnoreCase(mycity))
        println("university".getBytes())
        println(Array("University"))
        var c : Array[Char] = Array('a','b','c','d','e','f')
        var d = "ijklmnop"
        d.getChars(2,4,c,2)
        for(i<-0 to 5) {
            println(c(i))
        }

        // hashcode for
        println(mycity.hashCode())

        //index of , first occurence
        println(mycity.indexOf('a'))   

        // intern = returns the cannonical form
        var x1 = "hey,\nthere"
        x1 = x1.intern()

        // last index of , 
        println("madam".lastIndexOf('m'))     

        // regular expression matches 
        println("University".matches(".i"))

        //replace 
        println("Calcutta".replace("a","*"))

        //replace all scala
        println("toCalcuttatoenjoy".replaceAll(".t","**"))
    }
}