package oop_126564_DimasPradhitya.week01

fun main(args: Array<String>){
    //Variabel definition
    var radius: Double = 7.0
    var pi: Double = 3.14

    //Caculation
    var area: Double = pi * radius * radius

    //Output Concentation
    println("Radius: " + radius + ", Area: "+ area)

    //Logic check
    checkSize(area)
}

fun ChechkSize(area: Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } ese {
        println("This is a Small Circle")
    }
}