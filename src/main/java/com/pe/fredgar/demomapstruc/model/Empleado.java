package com.pe.fredgar.demomapstruc.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Empleado {
    private Integer id;
    private String codigo;
    private Double sueldo;
    private Direccion direccion;

}
