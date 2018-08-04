package com.ogr

import com.ogr.servlet.ChatServlet
import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.ServletContextHandler
import org.eclipse.jetty.servlet.ServletHolder

fun main(args: Array<String>) {
//    var i = 1
//    while(true) {
//        println("Do something: ${i++}")
//        Thread.sleep(1000L)
//    }
    val server = Server(Integer.valueOf(System.getenv("PORT")))
    val context = ServletContextHandler(ServletContextHandler.SESSIONS)
    context.contextPath = "/"
    server.handler = context
    context.addServlet(ServletHolder(ChatServlet()), "/*")
    server.start()
    server.join()
}