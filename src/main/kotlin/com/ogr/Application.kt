package main.kotlin.com.ogr

import java.time.Instant
import java.util.*

fun main(args: Array<String>) {
    var i = 1
    while(true) {
        println("Do something: ${i++}")
        print("Введите сообщение: ")
        println("Ваше сообщение: ${readLine()}")
        Thread.sleep(1000L)
    }
}