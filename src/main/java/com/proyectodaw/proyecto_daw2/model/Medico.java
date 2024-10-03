package com.proyectodaw.proyecto_daw2.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "medicos")
public class Medico {

    @Id
    private int codigoMedico;
    private String nombreMedico;
    private String apellidoMedico;
    private int tipoDocumento;
    private String email;
    private String telefono;
}
