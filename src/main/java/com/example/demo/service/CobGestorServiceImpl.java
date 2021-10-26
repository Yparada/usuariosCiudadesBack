package com.example.demo.service;

import com.example.demo.entity.CobGestor;
import com.example.demo.repository.CobGestorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CobGestorServiceImpl implements  CobGestorService{

    @Autowired
    private CobGestorRepository cobGestorRepository;

    @Override
    public List<CobGestor> getAllCobGestor() {
        return cobGestorRepository.findAll();
    }
}
