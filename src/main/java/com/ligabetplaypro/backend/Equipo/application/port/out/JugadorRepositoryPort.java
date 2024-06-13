package com.ligabetplaypro.backend.Equipo.application.port.out;

import java.util.Optional;

import com.ligabetplaypro.backend.Equipo.domain.Jugador;

public interface JugadorRepositoryPort extends IntegranteEquipoRepositoryPort<Jugador> {

  Optional<Jugador> findByDorsal(Integer dorsal);

  Optional<Jugador> findByDemarcacion(String demarcacion);
}
