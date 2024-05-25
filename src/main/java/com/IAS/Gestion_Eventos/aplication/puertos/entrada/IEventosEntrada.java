package com.IAS.Gestion_Eventos.aplication.puertos.entrada;

import com.IAS.Gestion_Eventos.aplication.dominio.Modelo.Evento;
import org.springframework.data.repository.CrudRepository;

public interface IEventosEntrada extends CrudRepository<Evento,String> {

}
