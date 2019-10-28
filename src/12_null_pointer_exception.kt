fun main(args:Array<String>)
{
    var a:Int ?= null
    // "?" question mark is use to Assign "null" to variable

    // println("Enter Number")

    // you can also assign this variable a 'null' value
    // var b:Int ?= readLine()?.toInt()

    // "!!" (not null operator) not able to Assign "null" value to this variable

    println("Enter First Number: ")
    var x:Int = readLine()!!.toInt()
    println("Enter Second Number: ")
    var y:Int = readLine()!!.toInt()

    print("\nSum = ")
    println(x+y)

}