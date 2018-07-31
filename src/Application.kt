fun main(args: Array<String>) {
    var i = 1
    while(true) {
        println("Do something: ${i++}")
        Thread.sleep(1000L)
    }
}