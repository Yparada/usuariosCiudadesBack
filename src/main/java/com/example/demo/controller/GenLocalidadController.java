package com.example.demo.controller;

import com.example.demo.entity.GenLocalidad;
import com.example.demo.service.GenLocalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/localidad")
public class GenLocalidadController {

    @Autowired
    private GenLocalidadService genLocalidadService;

    @PostMapping
    public ResponseEntity<Integer> getCount(){
        return ResponseEntity.ok(genLocalidadService.getCount());
    }

    /*@GetMapping
    public ResponseEntity<List<GenLocalidad>> getAllGenLocalidad(){
        return ResponseEntity.ok(genLocalidadService.getAllGenLocalidad());
    }*/


}
