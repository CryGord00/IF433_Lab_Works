package oop_126564_DimasPradhitya.Week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0)
    println("Porsi kibble harus lebih dari 0 gr")

    if (isJammed) throw DispenserJamException()
}