package com.estudo006.springestudo006.service;

import com.estudo006.springestudo006.model.Usuario;
import com.estudo006.springestudo006.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public void cadastro(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public List<Usuario> ver(){
        return usuarioRepository.findAll();
    }
}