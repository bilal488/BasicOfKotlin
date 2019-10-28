class Employee
{
    var name:String = ""
    var bg:String = ""

    // to assign some default value
    constructor()
    {
        bg = "B+"
    }
}
fun main(args:Array<String>)
{
    var emp = Employee()
    emp.name="Bilal"
    println(emp.name)
    println(emp.bg)
}