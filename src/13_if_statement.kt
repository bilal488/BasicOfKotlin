fun main(args:Array<String>)
{
    println("Enter Marks: ")
    var marks:Int= readLine()!!.toInt()

    if (marks>=50)
        println("Pass")
    else
        println("Fail")
}