package com.pe.fredgar.demomapstruc.api;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DireccionCloud {

    private Integer id;
    private String calle;
    private String numero;
    private String piso;


}
