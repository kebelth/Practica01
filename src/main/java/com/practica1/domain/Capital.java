package com.practica1.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="capital")
public class Capital implements Serializable {
    
    //Para utilizarlo en la generación de la llave primaria autoincremental
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCapital;
            
    String nombre;
    String pais;
    String poblacion;
    String playa;
    String extension;

    public Capital() {  //Constructor default
    }

    public Capital(String nombre, String pais, String poblacion, String playa, String extension) {
        this.nombre = nombre;
        this.pais = pais;
        this.poblacion = poblacion;
        this.playa = playa;
        this.extension = extension;
    }

    

   
}
