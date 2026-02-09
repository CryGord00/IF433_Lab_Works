package oop_126564_DimasPradhitya.week01

fun main(args: Array<String>){
    //Variabel definition
    val radius = 7.0
    val pi = 3.14

    //Caculation
    val area = pi * radius * radius

    //Output Concentation
    println("Radius:  $radius, Area: $area)

    //Logic check
    println(checkSize(area))
}

fun ChechkSize(area: Double) = if (area > 100) {
    "this is a Big Circle"
    } ese {
        "This is a Small Circle"
    }
}