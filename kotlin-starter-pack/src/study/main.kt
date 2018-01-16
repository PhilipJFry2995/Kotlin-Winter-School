package study

fun main(args: Array<String>) {
    // Объявление переменных
    var st: String = ""
    var a = "Hello"
    a = "kotlin"
    var b = 10
    val value = 10
    var double = 1.2
    // Работа с функциями
    println(max(5, 3))
    // Строковые литералы
    var name = "Dennis"
    println("Hello, $name")
    println("Hello, $args[0]")
    println("Hello, ${max(5, 2) > 1}")
    // Работа с объектами
    val person = Person("Name")
    println(person.name)
    println(person.isSquare)

    val rect = Rectangle(1, 1)
    rect.isSquare = false
    // Внешняя функция
    myfun("Hello", 2)
    val st1 = 0
    // Оператор when
    when (st1) {
        in 1..10 -> println("0")
        1 -> println("1")
        2 -> {
            println("1")
            println("1")
        }
        3, 4, 5, 6, 7, 8 -> {
        }
        else -> {
            // some code
        }
    }
    var c1 = 1
    var c2 = 2
    when (setOf(c1, c1)) {
        setOf(1, 2) -> println("3")
        setOf(2, 3) -> println("5")
    }
    // Интервалы
    val f = st1 in 1..10
    if ('a' in 'a'..'f');
}

// Функция со значением по умолчанию
fun myfun(st: String, i: Int = 1): Int {
    println(st)
    println(i)
    return 1
}

// Пример класса
class Person(val name: String, var isMarried: Boolean = false) {
    val isSquare: Boolean = true
}

// Класс с переопределенными методами get и set
class Rectangle(val heigth: Int, val width: Int) {
    var isSquare: Boolean = false
        get() {
            return heigth == width
        }
        set(value) {
            println("Value is set")
            field = value
        }
}

// Пример функции с одной строчкой
fun max(a: Int, b: Int) = if (a > b) a else b