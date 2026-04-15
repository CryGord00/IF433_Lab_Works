package oop_126564_DimasPradhitya.Week08

object DatabaseMock {
    fun findUser(id: Int): UserProfile? {
        return if (id == 1) UserProfile("TestUser", "test@test.com") else null
    }
}

fun runMockUnitTest() {
    println("\n=== RUNNING UNIT TEST ===")
    val testUser = DatabaseMock.findUser(1)

    // Di Testing, penggunaan !! lazim agar crash sekencang-kencangnya jika gagal
    val initial = testUser!!.name.substring(0, 1)

    check(initial == "T") { "Test Failed! Initial is wrong." }
    println("Test Passed: Initial is T")
}