package com.example.demo.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "GEN_LOCALIDAD",schema = "GCINTEGRIDAD")
@Getter
public class GenLocalidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LOCALIDAD_ID")
    private Long localidadId;
}
