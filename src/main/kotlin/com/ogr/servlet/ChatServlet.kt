package com.ogr.servlet

import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


class ChatServlet : HttpServlet() {
    var counter = 1
    override fun doPost(req: HttpServletRequest, resp: HttpServletResponse) {
        resp.writer.print("Otvet dan! Your message: ${req.getParameter("message")}. Counter: ${counter++}")
    }
}