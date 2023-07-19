package com.smbustillo.panel.models;

import lombok.*;

//@Getter @Setter @ToString @NoArgsConstructor
@Data @AllArgsConstructor
public class Usuario {

    private Integer id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;


}
