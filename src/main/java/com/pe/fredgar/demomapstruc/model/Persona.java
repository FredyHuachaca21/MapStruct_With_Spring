package com.pe.fredgar.demomapstruc.model;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Persona {

    private Integer id;
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDateTime fechaCreacion;

    private LocalDateTime fechaFin;

}
