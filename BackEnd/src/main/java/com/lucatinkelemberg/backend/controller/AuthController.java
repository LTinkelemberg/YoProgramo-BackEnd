package com.lucatinkelemberg.backend.controller;

import java.lang.reflect.Method;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucatinkelemberg.backend.DTO.UserDTO;
import com.lucatinkelemberg.backend.model.DatosUsuario;
import com.lucatinkelemberg.backend.service.UsuarioService;
@RestController
@CrossOrigin (origins = {"http://localhost:4200/"})
@RequestMapping ("/auth")
public class AuthController {
    @Autowired
    UsuarioService usuarioService;
    @PostMapping ("/login")
    public UserDTO login(@RequestBody LoginRequest request) {
        return this.usuarioService.Login(request);
    }

}
