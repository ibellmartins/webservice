package com.example.webservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/carros")
public class CarrosController {
    private List<Carro> carros = new ArrayList<>();

    public CarrosController() {
        // Adicionando alguns cursos iniciais
        carros.add(new Carro("Roma", "Ferrari"));
        carros.add(new Carro("Taycan", "Porsche"));
    }

    @GetMapping
    public List<Carro> listarCarro() {
        return carros;
    }
}

//Nome: Isabella Sofia Martins - RA: 10420398