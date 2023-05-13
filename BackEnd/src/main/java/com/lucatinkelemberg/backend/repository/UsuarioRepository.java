package com.lucatinkelemberg.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucatinkelemberg.backend.model.DatosUsuario;
@Repository
public interface UsuarioRepository extends JpaRepository<DatosUsuario, Integer> {
        public DatosUsuario findByEmailAndPassword(String email, String password);

}
