package oop_126564_DimasPradhitya.week04

import org.intellij.lang.annotations.Language

class Developer(
    name: String,
    baseSalary: Int,
    val programuingLanguage: String // khusus Developer
) : Employee(name, baseSalary) {

    override fun work() {
        println("$nama sedang ngoding menggunakan $programuingLanguage")
    }
    // Calculate() tidak di-override karena mengikuti aturan Parent
}