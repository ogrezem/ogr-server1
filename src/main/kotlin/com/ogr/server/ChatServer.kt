package com.ogr.server

import org.java_websocket.WebSocket
import org.java_websocket.handshake.ClientHandshake
import org.java_websocket.server.WebSocketServer
import java.lang.Exception


class ChatServer : WebSocketServer() {
    override fun onOpen(conn: WebSocket?, handshake: ClientHandshake?) {
        
    }

    override fun onClose(conn: WebSocket?, code: Int, reason: String?, remote: Boolean) {

    }

    override fun onMessage(conn: WebSocket?, message: String?) {

    }

    override fun onStart() {

    }

    override fun onError(conn: WebSocket?, ex: Exception?) {

    }
}