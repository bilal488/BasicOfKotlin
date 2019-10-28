open class A
{
    open fun show()
    {
        println("Parent")
    }
}
class B : A()
{
    override fun show()
    {
        println("Child")
    }
}
fun main(args:Array<String>)
{
    // function with same 'name' and same 'parameters'
    // one in parent class
    // other in child class

    var ob1 = A()
    ob1.show()
    var ob2 = B()
    ob2.show()
}