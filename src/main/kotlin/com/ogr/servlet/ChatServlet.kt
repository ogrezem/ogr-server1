package com.ogr.servlet

import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


class ChatServlet : HttpServlet() {
    var counter = 1
    override fun doPost(req: HttpServletRequest, resp: HttpServletResponse) {
        var requestText = req.getParameter("message")
        println("Текст POST запроса: $requestText")
        println("Счётчик $counter")
        val attributeNames = req.attributeNames
        println("Имена атрибутов: ")
        while(attributeNames.hasMoreElements() ) {
            println(attributeNames.nextElement())
        }
        resp.writer.print("Otvet dan! Your message: $requestText. Counter: ${counter++}")
    }
    override fun doGet(req: HttpServletRequest, resp: HttpServletResponse) {
        var requestText = req.getParameter("message")
        println("Текст GET запроса: $requestText")
        println("Счётчик $counter")
        resp.writer.print("Otvet dan! Your message: $requestText. Counter: ${counter++}")
    }

    
}