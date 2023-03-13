import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File

fun main() {
    //writeToFile()

    readFromFile()
}

fun readFromFile() {
    val file = File("person.json")
    val people = Json.decodeFromString<Array<Person>>(file.readText())
    people.forEach {
        println(it)
    }
}

fun writeToFile() {
    val p1 = Person("John", 20, 1.8)
    val p2 = Person("Jane", 19, 1.6)
    val p3 = Person("Piter", 22, 1.7)

    val people = arrayOf(p1, p2, p3)

    val file = File("person.json")
    val s = Json.encodeToString(people)
    file.printWriter().use {
        it.println(s)
    }
}