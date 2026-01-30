//Agregamos y llamamos funciones de extension o herencia

//Ejercicio 1
fun Int.isPositive(): Boolean = this > 0

fun main() {
    println(1.isPositive())
    // true
}

//Ejercicio 2
fun String.toLowercaseString(): String = this.lowercase()

fun main() {
    println("Hello World!".toLowercaseString())
    // hello world!
}

