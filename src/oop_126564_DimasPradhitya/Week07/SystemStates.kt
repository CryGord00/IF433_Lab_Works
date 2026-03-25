package oop_126564_DimasPradhitya.Week07

enum class AppState {
    STARTING, RUNNING, STOPED;

    sealed class ApiResponse {
        data class Success(val data:String) : ApiResponse()
        data class Error(val error:String) : ApiResponse()
        object Loading : ApiResponse()
    }
}