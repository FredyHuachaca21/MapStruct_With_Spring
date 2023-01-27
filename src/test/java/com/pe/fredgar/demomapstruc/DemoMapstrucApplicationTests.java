package com.pe.fredgar.demomapstruc;
import com.pe.fredgar.demomapstruc.mapper.EmpleadoMapper;
import com.pe.fredgar.demomapstruc.mapper.PersonaMapper;
import com.pe.fredgar.demomapstruc.mapper.dto.EmpleadoDTO;
import com.pe.fredgar.demomapstruc.model.Direccion;
import com.pe.fredgar.demomapstruc.model.Empleado;
import com.pe.fredgar.demomapstruc.model.Persona;
import com.pe.fredgar.demomapstruc.mapper.dto.PersonaDTO;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
class DemoMapstrucApplicationTests {

    PersonaMapper personaMapper = Mappers.getMapper(PersonaMapper.class);
    EmpleadoMapper empleadoMapper = Mappers.getMapper(EmpleadoMapper.class);

      @Test
    void testPersonaMapper() {

        Persona persona = new Persona();
        persona.setId(1);
        persona.setNombre("Kath");
        persona.setApellido("Ramos");
        persona.setEdad(15);
        persona.setFechaCreacion(LocalDateTime.now());
        persona.setFechaFin(LocalDateTime.now());

        PersonaDTO personaDTO = personaMapper.personaToPersonaDTO(persona);
        System.out.println(persona);
        System.out.println(personaDTO);
        assertEquals(personaDTO.getId(), persona.getId());
        assertNotNull(personaDTO.getId());
        assertNotEquals(personaDTO.getNombre(), "KJHKFJAS");


    }
  @Test
  void testEmpleadoMapper(){
    Empleado empleado = new Empleado();
    empleado.setId(1);
    empleado.setCodigo("5M");
    empleado.setSueldo(1200.00);

    Direccion direccion = new Direccion();
    direccion.setId(1);
    direccion.setDir("Calle Lima 20");

    empleado.setDireccion(direccion);

    EmpleadoDTO empleadoDTO = empleadoMapper.empleadoToEmpleadoDTO(empleado);
    System.out.println(empleado);
    System.out.println(empleadoDTO);
    assertEquals(empleadoDTO.getCodEmpleado(), "5M");
    assertEquals(empleadoDTO.getCodEmpleado(), empleado.getCodigo());
    assertEquals(empleadoDTO.getIdEmpleado(), empleado.getId());
    assertEquals(empleadoDTO.getDireccionDTO().getId(), empleado.getDireccion().getId());
  }
}
