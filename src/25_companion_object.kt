class AB
{
    var x:Int = 0
    companion object {
        var y:Int = 0
    }
}
// companion object -> Static variable
// you can access this variable by name of class
// you dont need to create the object of the class
fun main(args:Array<String>)
{
    var ob1 = AB()
    ob1.x++
    println(ob1.x)
    var ob2 = AB()
    ob2.x++
    println(ob2.x)

    println("")

    // companion object
    AB.y++
    AB.y++
    println(AB.y)
}
