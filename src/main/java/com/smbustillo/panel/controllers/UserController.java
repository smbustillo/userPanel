package com.smbustillo.panel.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/api/usuarios")
    public String helloWorld() {
        return "[\n" +
                "  {\n" +
                "    \"id\": 1,\n" +
                "    \"nombre\": \"lucas\",\n" +
                "    \"apellido\": \"moy\",\n" +
                "    \"telefono\":\"213123423\",\n" +
                "    \"email\": \"lucasmoy.dev@atl.academy\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 1,\n" +
                "    \"nombre\": \"lucas\",\n" +
                "    \"apellido\": \"moy\",\n" +
                "    \"telefono\":\"213123423\",\n" +
                "    \"email\": \"lucasmoy.dev@atl.academy\"\n" +
                "  }\n" +
                "]";
    }
}
