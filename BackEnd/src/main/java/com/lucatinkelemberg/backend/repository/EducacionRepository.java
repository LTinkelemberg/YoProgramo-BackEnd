package com.lucatinkelemberg.backend.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lucatinkelemberg.backend.model.DatosEducacion;

@Repository
public interface EducacionRepository extends CrudRepository<DatosEducacion, Integer> {
    
}
