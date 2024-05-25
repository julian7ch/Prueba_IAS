package com.IAS.Gestion_Eventos.infraestructura.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "Eventos")
@AllArgsConstructor
@Data
public class EntidadEventos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String date;
    private String location;
}
