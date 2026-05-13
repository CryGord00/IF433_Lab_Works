package oop_126564_DimasPradhitya.Week12

fun divide(a: Int, b: Int): Int {
    try {
        return a / b
    }catch (e: ArithmeticException) {
        println("Eroro: ${e.message}")
        return -1
    }finally {
        println("Division attempt finished")
    }
}