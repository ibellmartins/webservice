package com.example.webservice;

import java.util.ArrayList;
import java.util.List;

public class CarrosManager {
    private List<Carro> carros;

    public CarrosManager(){
        this.carros = new ArrayList<>();
        this.carros.add(new Carro("Roma", "Ferrari"));
        this.carros.add(new Carro("Taycan", "Porsche"));
   }

   public List<Carro> getCarros(){
       return carros;
   }
}

//Nome: Isabella Sofia Martins - RA: 10420398
