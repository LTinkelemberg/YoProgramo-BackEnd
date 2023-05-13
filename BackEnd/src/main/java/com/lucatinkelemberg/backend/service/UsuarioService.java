package com.lucatinkelemberg.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucatinkelemberg.backend.DTO.UserDTO;
import com.lucatinkelemberg.backend.controller.LoginRequest;
import com.lucatinkelemberg.backend.model.DatosUsuario;
import com.lucatinkelemberg.backend.repository.UsuarioRepository;

@Service

public class UsuarioService  {
    @Autowired
    UsuarioRepository usuarioRepository;
    public UserDTO Login(LoginRequest loginRequest) {
        UserDTO userDTO = new UserDTO();
       DatosUsuario datosUsuario =  usuarioRepository.findByEmailAndPassword(loginRequest.getEmail(), loginRequest.getPassword());
       if(datosUsuario != null){
        userDTO = new UserDTO( datosUsuario.getIdUsuario(), datosUsuario.getEmail());
       }
       return userDTO;
    }
}
