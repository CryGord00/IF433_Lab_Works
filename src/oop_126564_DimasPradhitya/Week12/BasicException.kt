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


fun main() {
    println("==== TEST TRY AS EXPRESSION ===")
    val inputString = "123A"

    //try langsung mengembalikan hasil parsing, atau -1 jika gagal
    val result: Int = try {
        Integer.parseInt(inputString)
    } catch (e: NumberFormatException) {
        -1
    }
    println("Hasil Parsing: $result")
}