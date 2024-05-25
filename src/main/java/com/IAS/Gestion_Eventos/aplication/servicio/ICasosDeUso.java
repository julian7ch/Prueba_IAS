package com.IAS.Gestion_Eventos.aplication.servicio;


import com.IAS.Gestion_Eventos.aplication.dominio.Modelo.Evento;
import com.IAS.Gestion_Eventos.aplication.puertos.entrada.IEventosEntrada;

import java.util.List;
import java.util.Optional;

public interface ICasosDeUso {
    public Iterable<Evento> obtenerListaEventos(List<String> id);

    public Evento crearEvento(Evento evento);

    public Optional<Evento> detallesEventoId(String id);


    public Evento actualizarEvento(Evento evento);

    public void borrarEvento(Evento evento);




}
