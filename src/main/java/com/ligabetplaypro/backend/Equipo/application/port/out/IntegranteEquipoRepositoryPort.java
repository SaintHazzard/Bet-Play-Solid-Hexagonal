package com.ligabetplaypro.backend.Equipo.application.port.out;

import java.util.Optional;

import com.ligabetplaypro.backend.Equipo.domain.IntegranteEquipo;
import com.ligabetplaypro.backend.Equipo.domain.Team;

public interface IntegranteEquipoRepositoryPort<T extends IntegranteEquipo> {

  T save(T integranteEquipo);

  void deleteById(Long id);

  Optional<T> findById(Long id);

  Optional<T> findByNombre(String nombre);

  Optional<T> findByApellidos(String apellido);

  Optional<T> findByEdad(Integer edad);

  Optional<T> findByTeam(Team team);

  Optional<T> findByTeamId(Long id);

  Optional<T> findByTeamName(String name);
}
