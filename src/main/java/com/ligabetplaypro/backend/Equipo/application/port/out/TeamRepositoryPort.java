package com.ligabetplaypro.backend.Equipo.application.port.out;

import java.util.Optional;

import java.util.List;

import com.ligabetplaypro.backend.Equipo.domain.Team;

public interface TeamRepositoryPort {
  Team save(Team partido);

  Optional<Team> findById(Long id);

  void deleteById(Long id);

  List<Team> findAll();

  Optional<Team> findByNombre(String nombre);

  Optional<Team> findByCiudad(String ciudad);

}
