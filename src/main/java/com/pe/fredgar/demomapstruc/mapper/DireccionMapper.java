package com.pe.fredgar.demomapstruc.mapper;

import com.pe.fredgar.demomapstruc.mapper.dto.DireccionDTO;
import com.pe.fredgar.demomapstruc.model.Direccion;
import org.mapstruct.Mapper;

@Mapper
public interface DireccionMapper {
  Direccion direcionDtoToDireccion(DireccionDTO direccionDTO);
  DireccionDTO direccionToDireccionDTO(Direccion direccion);

}
