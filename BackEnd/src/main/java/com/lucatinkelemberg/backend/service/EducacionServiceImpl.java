package com.lucatinkelemberg.backend.service;

import java.util.Optional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucatinkelemberg.backend.model.DatosEducacion;
import com.lucatinkelemberg.backend.repository.EducacionRepository;

@Service
public class EducacionServiceImpl implements EducacionService{

    @Autowired
    private EducacionRepository educacionRepository;
    @Override
    public DatosEducacion createDatosEducacion(DatosEducacion datosEducacion) {
       return educacionRepository.save(datosEducacion);
    }

    @Override
    public List<DatosEducacion> getEducacion() {
        return (List<DatosEducacion>) educacionRepository.findAll();
    }

    @Override
    public DatosEducacion getEducacionById(Integer idEducacion) {
        return educacionRepository.findById(idEducacion).get();
    }

    @Override
    public void deleteDatoseducacion(Integer idEducacion) {
        educacionRepository.deleteById(idEducacion);
    }

    @Override
    public DatosEducacion updateDatoseducacion(DatosEducacion datosEducacion, Integer idEducacion) {
        DatosEducacion datosEducacion1 = educacionRepository.findById(idEducacion).get();
        datosEducacion1.setEducacion_institucion(datosEducacion.getEducacion_institucion());
        datosEducacion1.setEducacion_periodo(datosEducacion.getEducacion_periodo());

        return educacionRepository.save(datosEducacion1);

    }
    
}
