package com.ARSW.app.controller;

import com.ARSW.app.adapter.IAiAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/chatGPT")
public class chatController {

    @Autowired
    IAiAdapter adaptador;

    @PostMapping
    public String recibirMensaje(@RequestBody Map<String, String> mensaje) {
        return adaptador.generateResponse(mensaje.get("prompt"));
    }
}
