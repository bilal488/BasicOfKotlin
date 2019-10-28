open class ABC
{
    // function with same name but different parameters
    fun sum(x:Int,y:Int)
    {
        println(x+y)
    }
    fun sum(x:Int,y:Int,z:Int)
    {
        println(x+y+z)
    }
}
fun main(args:Array<String>)
{
    var ob1 =ABC()

    ob1.sum(4,8)
    ob1.sum(3,4,6)
}