package com.ligabetplaypro.backend.Equipo.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ligabetplaypro.backend.Equipo.application.port.out.IntegranteEquipoRepositoryPort;
import com.ligabetplaypro.backend.Equipo.domain.Jugador;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Long>, IntegranteEquipoRepositoryPort<Jugador> {

}
