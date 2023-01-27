package com.pe.fredgar.demomapstruc.mapper.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PersonaDTO {

    private Integer id;
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDateTime fechaCreacionDTO;
    private String fechaFinDTO;

}
