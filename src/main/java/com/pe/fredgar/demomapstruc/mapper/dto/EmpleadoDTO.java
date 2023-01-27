package com.pe.fredgar.demomapstruc.mapper.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmpleadoDTO {
    private Integer idEmpleado;
    private String codEmpleado;
    private Double sueldo;
    private DireccionDTO direccionDTO;

}
