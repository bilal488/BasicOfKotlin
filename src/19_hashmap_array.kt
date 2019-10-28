fun main(args:Array<String>)
{
    // HashMap Array have two values
    // first one is 'key' and second id its 'value'
    var emp = HashMap<String,Int>()
    emp.put("ALi",5000)
    emp.put("Ahmed",8000)

    for (x in emp)
        println(x)

    println("")

    for (z in emp.keys)
    {
        println(z) // print 'key'
        println(emp[z]) // print 'value'
    }
}