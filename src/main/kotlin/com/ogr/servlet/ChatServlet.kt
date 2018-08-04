package com.ogr.servlet

import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


class ChatServlet : HttpServlet() {
    var counter = 1
    override fun doPost(req: HttpServletRequest, resp: HttpServletResponse) {
        val requestText = req.getParameter("message")
        println("Текст запроса: $requestText")
        println("Счётчик $counter")
        resp.writer.print("Otvet dan! Your message: $requestText. Counter: ${counter++}")
    }
}