import kotlinx.serialization.Serializable

@Serializable
data class Person(
    var name: String,
    var age: Int,
    var height: Double
)
