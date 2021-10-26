package com.example.demo.controller;

import com.example.demo.entity.CobGestor;
import com.example.demo.service.CobGestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/gestor")
public class CobGestorController {

    @Autowired
    public CobGestorService cobGestorService;

    @GetMapping
    public ResponseEntity<List<String>> getAllNombreCompleto(){
        List<CobGestor> lista = cobGestorService.getAllCobGestor();
        List<String> listb = new ArrayList<>();
        String nombre,apellido;

        for(CobGestor c: lista){
        if (c.getSegundoNombre() == null || c.getSegundoNombre().isEmpty()){
            nombre = c.getPrimerNombre();
        }else{
            nombre = c.getPrimerNombre()+" "+c.getSegundoNombre();
        }

        if (c.getSegundoApellido() ==null || c.getSegundoApellido().isEmpty()){
            apellido = c.getPrimerApellido();
        }else {
            apellido = c.getPrimerApellido()+" "+c.getSegundoApellido();
        }

        listb.add(nombre+" "+apellido);
        }
        return ResponseEntity.ok(listb);
    }

    /*@GetMapping
    public ResponseEntity<List<CobGestor>> getAllCobGestor(){
        return ResponseEntity.ok(cobGestorService.getAllCobGestor());
    }*/
}
