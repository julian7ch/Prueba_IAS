package com.IAS.Gestion_Eventos.infraestructura.adaptadores.entrada;

import com.IAS.Gestion_Eventos.aplication.dominio.Modelo.Evento;
import com.IAS.Gestion_Eventos.aplication.puertos.entrada.IEventosEntrada;
import com.IAS.Gestion_Eventos.aplication.servicio.ICasosDeUso;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("iasapi/events")
public class EventosControlador implements ICasosDeUso {

    private final IEventosEntrada eventosEntrada;

    public EventosControlador(IEventosEntrada eventosEntrada) {
        this.eventosEntrada = eventosEntrada;
    }

    @GetMapping("user/{id}")
    public Iterable<Evento> obtenerListaEventos(List<String> id) {
        return eventosEntrada.findAllById(id);
    }

    @PostMapping
    public Evento crearEvento(@RequestBody Evento evento) {
        return eventosEntrada.save(evento);
    }


    @GetMapping("{/id}")
    public Optional<Evento> detallesEventoId(@PathVariable String id) {
        return eventosEntrada.findById(id);
    }

    @PutMapping
    public Evento actualizarEvento(@RequestBody Evento evento) {
        return eventosEntrada.save(evento);
    }

    @DeleteMapping
    public void borrarEvento(@RequestBody Evento evento) {
        eventosEntrada.delete(evento);

    }
}
