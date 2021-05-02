interface livingSpecies{

    var kind: String
    var age:Int

    fun introduce(){
        println("i am $kind kind and I am $age years old")
    }

    fun expectedlive():Int

    fun ageannounce()
}

class Cat:livingSpecies{
    override var kind: String = "cat"
    override var age:Int = 12

    override fun expectedlive(): Int {
        return age*10
    }

    override fun ageannounce(){
        println("My expected live is ${expectedlive()}")
    }

}

 class Pig{

     companion object{
         fun show(){
             println("showing without creating obj")
         }
     }

}

data class chair(val name:String, val brand:String,val price:Int)

val mychair = chair("new chair","bruceBrand",30)
println(mychair.toString())
println("my chair got the name: ${mychair.name}.")

class genericPrinter<T>(input:T){
    init{
        println("the thing has value: "+input)
    }
}

val genericone = genericPrinter<String>("I love you")
val generictwo = genericPrinter<Int>(321)


val mylambda:(String)->Unit = {s:String->print("string is $s")}

fun useLambda(function:(String)->Unit, thing:String){
    function(thing)
}

useLambda(mylambda,"bruce")


class combine(val a:String, val b:String){
    var num:String = a
    var s:String = b
}

try{
    var num = 10 / 0
}
catch(e: ArithmeticException){
    // caught and handles it
    println("Divide by zero not allowed")
}
