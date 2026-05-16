package com.estudo006.springestudo006.controllers;

import com.estudo006.springestudo006.model.Usuario;
import com.estudo006.springestudo006.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//esseses
@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ControllerUsuarios {

    private final UsuarioService usuarioService;

    @GetMapping("/ver")
    @ResponseStatus(HttpStatus.OK)
    public List<Usuario> ver() {
        return usuarioService.ver();
    }

    @PostMapping("/cadastrar")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public String criar(@RequestBody Usuario usuario){
        System.out.println(usuario.getEmail()+" "+usuario.getSenha());
        usuarioService.cadastro(usuario);
        return "usuario cadastrado";
    }
}