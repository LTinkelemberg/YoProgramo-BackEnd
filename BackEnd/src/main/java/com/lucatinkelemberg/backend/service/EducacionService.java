package com.lucatinkelemberg.backend.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucatinkelemberg.backend.model.DatosEducacion;
import com.lucatinkelemberg.backend.repository.EducacionRepository;
import java.util.List;
@Service
public interface EducacionService {
    @Autowired
    //crear Educacion
    public DatosEducacion createDatosEducacion(DatosEducacion datosEducacion);
    //read Educacion
    public List<DatosEducacion> getEducacion();
    //read Ecucacion by ID
    public DatosEducacion getEducacionById(Integer idEducacion);
    //delete Educacion
    public void deleteDatoseducacion(Integer idEducacion);
    //update educacion
    public DatosEducacion updateDatoseducacion(DatosEducacion datosEducacion, Integer idEducacion);

}
