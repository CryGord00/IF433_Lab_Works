package oop_126564_DimasPradhitya.week04

import org.intellij.lang.annotations.Language

class Deceloper(
    name: String,
    baseSalary: Int,
    val programuingLanguage: String // khusus Developer
) : Employee(nama, baseSalary) {

    override fun work() {
        println("$name sedang ngoding menggunakan $programuingLanguage")
    }
    // Calculate() tidak di-override karena mengikuti aturan Parent
}