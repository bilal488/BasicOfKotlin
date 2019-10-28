fun main(args:Array<String>)
{
    for (x in 1..10)
        println(x)

    println("\n")

    for (y in 10 downTo 1)
        print("$y\t")

    println("\n")

    // print odd numbers
    for (x in 1..10 step 2)
        print("$x\t")

    println("\n")

    // print even numbers
    for (x in 2..10 step 2)
        print("$x\t")

}