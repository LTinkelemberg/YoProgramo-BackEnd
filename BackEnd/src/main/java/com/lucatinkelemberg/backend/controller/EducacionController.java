package com.lucatinkelemberg.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucatinkelemberg.backend.model.DatosEducacion;
import com.lucatinkelemberg.backend.service.EducacionService;



@RestController
@RequestMapping("/educacion")
public class EducacionController {
    @Autowired
    private EducacionService educacionService;

    @GetMapping("/")
    public String helloworld() {
        return "hello world";
    }
    @PostMapping("/creareducacion")
    public DatosEducacion createEducacion(@RequestBody DatosEducacion datosEducacion) {
        DatosEducacion datosEducacion1 = educacionService.createDatosEducacion(datosEducacion);
        return datosEducacion1;

    }

    @GetMapping("/leereducacion")
    public List<DatosEducacion> getEducacion(){
        return  educacionService.getEducacion();
    }
    @PutMapping("/actualizar")
    public DatosEducacion updateDatoseducacion(@RequestBody DatosEducacion datosEducacion, @PathVariable("idEducacion") Integer idEducacion) {
        return educacionService.updateDatoseducacion(datosEducacion, idEducacion);
    }


    @DeleteMapping("/borrar/{idEducacion}")
    public String deleteDatoseducacion(@PathVariable("idEducacion") Integer idEducacion) {
            educacionService.deleteDatoseducacion(idEducacion);
            return "Datos de Educacion borrados";
    }

    @GetMapping("/educacion/{idEducacion}")
    public DatosEducacion getEducacionById(@PathVariable("idEducacion") Integer idEducacion) {
        return educacionService.getEducacionById(idEducacion);

    }
}
