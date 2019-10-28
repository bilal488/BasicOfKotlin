fun main(args:Array<String>)
{
    // when -> switch
    // when loop is use in kotlin instead of Switch loop
    println("Enter Number: ")
    var x:Int = readLine()!!.toInt()

    when(x)
    {
        1 -> println("A")
        2 -> println("B")
        in 3..5 -> println("C")
        else -> println("D")
    }
}