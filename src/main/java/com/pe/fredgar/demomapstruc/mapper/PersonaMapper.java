package com.pe.fredgar.demomapstruc.mapper;

import com.pe.fredgar.demomapstruc.model.Persona;
import com.pe.fredgar.demomapstruc.mapper.dto.PersonaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface PersonaMapper {

    @Mappings({
        @Mapping(target = "fechaCreacionDTO", source = "fechaCreacion", dateFormat = "dd-MM-yyy HH:mm:ss"),
        @Mapping(target = "fechaFinDTO", source = "fechaFin", dateFormat = "dd-MM-yyy HH:mm:ss"),
    })
    PersonaDTO personaToPersonaDTO(Persona persona);
    Persona personaDTOToPersona(PersonaDTO personaDTO);

}
