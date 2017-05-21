// kotlinc Another.kt -include-runtime -d Another.jar; java -jar Another.jar

fun sayHi() = "Hi"

fun main(args : Array<String>) {
    println(sayHi())
}