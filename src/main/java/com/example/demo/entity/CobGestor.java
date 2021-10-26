package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = " COB_GESTOR",schema = "GCCOBRANZAS")
@Getter @Setter
public class CobGestor {

    @Id
    @Column(name = "USUARIO_ID")
    private String usuario_Id;

    @Column(name = "PRIMER_NOMBRE")
    private String primerNombre;

    @Column(name = "SEGUNDO_NOMBRE")
    private String segundoNombre;

    @Column(name = "PRIMER_APELLIDO")
    private String primerApellido;

    @Column(name = "SEGUNDO_APELLIDO")
    private String segundoApellido;
}
