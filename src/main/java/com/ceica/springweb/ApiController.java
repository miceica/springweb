package com.ceica.springweb;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    @GetMapping("/pedirdatos")
    public List<String> prueba(@RequestParam Integer dat, @RequestParam String texto) {
        List<String> datos = new ArrayList<>();
        datos.add("hola mundo");
        datos.add("adios mundo");
        datos.add("Valor " + dat);
        datos.add("Texto " + texto);
        return datos;
    }
    @PostMapping("/alumno")
    public String crearAlumno(@RequestBody Alumno alumno){
        System.out.println(alumno.toString());
        alumno.setNombre("Alumno cambiado");
        return "alumno creado";
    }
}
