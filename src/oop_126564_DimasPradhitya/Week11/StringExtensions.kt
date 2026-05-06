package oop_126564_DimasPradhitya.Week11

// Extension function  dengan receiver 'this'
fun String.addGreeting(): String {
    return "Hello, $this"
}

//Extention fuction dengan parameter
fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}