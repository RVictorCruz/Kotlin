package Array

data class Person(val name: String, val age: Int) {
    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }
}

fun main() {
    val person = Person("Victor", 21)
    println(person)
}