object expression {
  def main(args: Array[String]) : Unit = {
      val getarea = (a: Double , b: Double) => 
            {a+100;b+200;println("Calculating Area ......");a*b}:Double
      println(getarea(10,20))
  }
}
