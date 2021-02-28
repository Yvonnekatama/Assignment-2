fun main () {
name()
 var remainder= modulus(50,30)
    println(remainder)
    var result= add (10,20,30,40)
    println(result)
    interesting()
}
fun name () {
    var name= ( "Hello yvonne")
    println(name)

}

fun modulus (num1:Int,num2:Int):Int{
    var modulus= num1%num2
    return modulus

}

fun add (num1:Int,num2:Int,num3:Int,num4:Int):Int {
    var add= num1+num2+num3+num4
    return add



}

fun interesting() {
    var interesting= "I'm curious"
    println(interesting)
}