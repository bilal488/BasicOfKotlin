class Student
{
    var name:String = ""
    var marks:Int = 0

    fun show()
    {
        println(name)
        println(marks)
    }
}
fun main(args:Array<String>)
{
    var ob1 = Student()

    ob1.name = "Bilal"
    ob1.marks = 84
    ob1.show()
}