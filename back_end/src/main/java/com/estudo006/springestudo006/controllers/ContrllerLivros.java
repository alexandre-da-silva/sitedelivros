package com.estudo006.springestudo006.controllers;


import com.estudo006.springestudo006.model.Livros;
import com.estudo006.springestudo006.service.LivrosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/Livros")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ContrllerLivros {


    private final LivrosService livrosService;

    @GetMapping("/ver")
    @ResponseStatus(HttpStatus.OK)
    public List<Livros> verlivros(){
        return livrosService.ver();
    }

    @PostMapping("/cadastrar")
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarlivro(@RequestBody Livros livro){
        livrosService.cadastrar(livro);
    }
}
