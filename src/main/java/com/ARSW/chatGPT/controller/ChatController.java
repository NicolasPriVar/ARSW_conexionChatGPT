package com.ARSW.chatGPT.controller;

import com.ARSW.chatGPT.adapter.IAiAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/chatGPT")
public class ChatController {

    @Autowired
    IAiAdapter adaptador;

    @PostMapping
    public String recibirMensaje(@RequestBody Map<String, String> mensaje) {
        return adaptador.generateResponse(mensaje.get("prompt"));
    }
}
