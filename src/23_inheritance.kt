open class X
{
    fun show()
    {
        println("Hello from parent")
    }
}
class XYZ : X()
{
    fun display()
    {
        println("Hello from child")
    }
}
fun main(args:Array<String>)
{
    var ob1 = XYZ()
    ob1.show()
    ob1.display()
}