package com.smbustillo.panel.controllers;

import com.smbustillo.panel.models.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    /*new Usuario(1,"Susana",
                    "Martinez","123455","smbustillo@gmail"));*/

    static List<Usuario> lstUsuarios =
            new ArrayList<>();

    @GetMapping("/api/usuarios")
    public List<Usuario> getUsers() {
        return lstUsuarios;
    }

    @DeleteMapping("/api/usuarios/{id}")
    public void deleteUser(@PathVariable String id){
        //Usuario found = lstUsuarios.stream().filter(user-> user.getId().equals(id)).findFirst().get();
        Usuario found = lstUsuarios.stream().filter(user-> id.equals(user.getId().toString())).findFirst().get();
        lstUsuarios.remove(found);

    }

    @PostMapping("/api/usuarios")
    public void addUser( @RequestBody Usuario user) {
        lstUsuarios.add(user);
    }
}
