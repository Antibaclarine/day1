fun main(){
numbers()
app()
operate()
    greeting("Clarine")
    remainder(3,4)
    println( sumOf(8,9,3,5))
    fact("I love cats")
    places("Nairobi")
    places("Nyeri")
    myName("Clarine")
    myName("Gubo")
    names()
    countries("Kenya")
    countries("kenya")
    enter("Mary")
    enter("Otieno")
    block()
    table()
    query()
    alpha()

}
fun numbers(){
var age:Byte=4
println(age)
var money:Short=10000
    println(money)
    var million:Int=1000000000
    println(million)
    var population:Long=1000000000000000000
    println(population)
    var volume:Double=45.458789231457
println(volume)







}fun app(){
    var name:String="Clarine Atieno"
    println(name)
    var age:Byte=21
    println(age)
    var weight:Double=58.0
    println(weight)
    var kenyan:Boolean=true
    println(kenyan)
    var tanzanian:Boolean=false
    println(tanzanian)

}
fun operate(){
//    var num1=50
//    var num2=50
//    var addition=num1+num2
//print(addition)
var year=20
    --year
    print(year)
var a=345
    var b=54
    a!=b
println(a!=b)
}
fun greeting(name:String){

    println("Hello $name")
}
fun remainder(num1:Int,num2:Int){
    println(num1%num2)
}
fun sumOf(num1: Int,num2: Int,num3:Int,num4:Int):Int{
//    var sum=num1+num2+num3+num4
    return (num1+num2+num3+num4)
}
fun fact(name: String){
    println(name)
}
fun places(place:String){
    if (place=="Nairobi")
        println(true)
    else{
        println(false)
    }
}
fun myName(name: String){
    if (name=="Clarine")
        println("Thats me")
    else{
        println("Thats not me")
    }
}
fun names(){
    var Clarine="girl"
    var Gubo="boy"
    if (Clarine==Gubo)
        println(true)
    else{
        println(false)
    }
}
fun countries(name: String){
    if (name=="Kenya")
        println("It's mine")
    else{
        println("It not mine")
    }
}
fun enter(leter:String){
    var girl="Mary"
    var boy="Otieno"
    if (girl==boy)
        println(true)
    else{
        println(false)
    }
}
fun block(){
    val fullNames:Array<String> = arrayOf("john","Mercy","Tom","Mop")
    println("Number of elements:${fullNames.size}")
    println(fullNames.size)

    fullNames.set(0,"jerry")
    println(fullNames.contentToString())
//if you want to add a name you use  .plus ,to replace you use .set
}
fun table(){
    var numbers:Array<Int> = arrayOf(3,5,4)
        println( numbers.last() *numbers[0])



}
fun query(){
    var i=1 until  10
//    for (i in 1..10) println(i)
    for (i in 1 until 10 step 2) println(i)
//    for (i in 1 downTo 10) println(i)
}
fun alpha(){
var met= "a..z"
    for (met in "a..z") println(met)
}


