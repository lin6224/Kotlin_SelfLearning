/**
 * Created by Jae on 5/25/2017.
 */

package demo

fun main(args : Array<String>){
    println("Hello World ")

    //String
    val name  : String = "Jae"
    println("Hello  $name")
    println(name[0])
    println(name.subSequence(1,3))
    println(name.contains("J"))

    // convert
    val letterGrade : Char = 'A'
    println("A is a Char : ${letterGrade is Char}")
    println(3.14.toInt())
    println('A'.toInt())
    println(64.toChar())

    //overflow
    if(true is Boolean){
        print("true is bool\n")
    }

    // Array
    var myArray = arrayOf(1, 1.2, "array")
    println(myArray[0])
    myArray[0] = 2
    println(myArray[0])
    println(myArray.size)
    println(myArray.contains("array"))
    println(myArray.first())
    println(myArray.indexOf(2))

    var copyArray = myArray.copyOfRange(0, 1)
    println(copyArray)

    var sqArray = Array( 5, { x -> x * x })
    println(sqArray[3])

    var arrInt : Array<Int> = arrayOf(1, 2, 3)
    println(arrInt.isEmpty())
}