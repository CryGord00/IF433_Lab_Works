package oop_126564_DimasPradhitya.Week06

interface Clickable {
    // EROR: Property in an interface canmot have a backing field
    val name: String = "Tombol RAhasia"

    // Function without body (Implicity Abstract)
    fun click()
}