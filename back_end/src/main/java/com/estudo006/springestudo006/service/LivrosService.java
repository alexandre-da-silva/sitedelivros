package com.estudo006.springestudo006.service;


import com.estudo006.springestudo006.model.Livros;
import com.estudo006.springestudo006.repository.LivrosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;

@Service
@RequiredArgsConstructor
public class LivrosService {

    private final LivrosRepository livrosRepository;

    public List<Livros> ver(){
        return livrosRepository.findAll();
    }
    public void cadastrar(@RequestBody Livros livros){
            livrosRepository.save(livros);
    }

}
