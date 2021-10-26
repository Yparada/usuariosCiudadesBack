package com.example.demo.service;

import com.example.demo.entity.GenLocalidad;
import com.example.demo.repository.GenLocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenLocalidadServiceImpl implements GenLocalidadService{

    @Autowired
    private GenLocalidadRepository genLocalidadRepository;


    @Override
    public List<GenLocalidad> getAllGenLocalidad() {
        return genLocalidadRepository.findAll();
    }

    @Override
    public int getCount() {
        return genLocalidadRepository.findAll().size();
    }
}
