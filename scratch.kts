fun makeNoise() {
    println("Ahhhh")
}

makeNoise()

fun greet(name: String) {
    println("hello $name")
}

greet("Bruce")

fun birthdayCake(name: String, age: Int) {
    println("Happy Birthday $name, now blow your $age candle! ")
}

birthdayCake("Christy", 24)

fun multiply(numone: Int, numtwo: Int): Int {
    return numone * numtwo
}

val result = multiply(5, 3)

"5 multiply by 3 is $result"

//***three ways to do a oneliner funciton
//first
fun square(number: Int): Int {
    return number * number
}

//second(function 'expression')
//use a equal sign after declaring the return type.
fun squareTwo(number: Int): Int = number * number

//three
//inferring a return type
//kotlin knows what the return type is
fun squareThree(number: Int) = number * number

square(5)
squareTwo(5)
squareThree(5)