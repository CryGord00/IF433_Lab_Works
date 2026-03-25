package oop_126564_DimasPradhitya.Week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient() // Instansiasi lewat Factory
    client.connect()

    println("\n== TEST SEALED CLASS ===")
    val response = ApiResponse = ApiResponse("Data berhabis ditarik")

    //EROR: 'when' ecperssion must be exhaustive
    val uiMassage = when (response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        is ApiResponse.Loading -> "Tampilkan Spinnner"
    }
}