package com.pe.fredgar.demomapstruc.mapper;

import com.pe.fredgar.demomapstruc.mapper.dto.EmpleadoDTO;
import com.pe.fredgar.demomapstruc.model.Empleado;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface EmpleadoMapper {

    @Mappings({
            @Mapping( target = "id", source = "idEmpleado"),
            @Mapping( target = "codigo", source = "codEmpleado"),
            @Mapping( target = "direccion", source = "direccionDTO"),
    })
    Empleado empleadoDtoToEmpleado(EmpleadoDTO empleadoDTO);

    @Mappings({
            @Mapping( target = "idEmpleado", source = "id"),
            @Mapping( target = "codEmpleado", source = "codigo"),
            @Mapping( target = "direccionDTO", source = "direccion")
    })
    EmpleadoDTO empleadoToEmpleadoDTO(Empleado empleado);

}
