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
        val parametersNames = req.parameterNames
        println("Параметры:")
        while(parametersNames.hasMoreElements() ) {
            val parameterName = parametersNames.nextElement() as String
            println("$parameterName равно ${req.getParameter(parameterName)}")
        }
        resp.writer.print("Otvet dan! Your message: $requestText. Counter: ${counter++}")
    }
    override fun doGet(req: HttpServletRequest, resp: HttpServletResponse) {
        var requestText = req.getParameter("message")
        println("Текст GET запроса: $requestText")
        println("Счётчик $counter")
        val attributeNames = req.attributeNames
        println("Имена атрибутов: ")
        if(attributeNames.toList().isEmpty())
            println("Не было найдено не одного аттрибута")
        while(attributeNames.hasMoreElements() ) {
            println(attributeNames.nextElement())
        }
        val parametersNames = req.parameterNames
        println("Имена параметров: ")
        if(parametersNames.toList().isEmpty())
            println("Не было найдено не одного параметра")
        while(parametersNames.hasMoreElements() ) {
            println(parametersNames.nextElement())
        }
        resp.writer.print("Otvet dan! Your message: $requestText. Counter: ${counter++}")
    }


}