package com.IAS.Gestion_Eventos.aplication.dominio.Modelo;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Evento {
    //private String id;
    private String name;
    private String date;
    private String location;
}
