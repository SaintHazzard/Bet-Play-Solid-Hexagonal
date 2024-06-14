package com.ligabetplaypro.backend.Equipo.application.port.in;

import java.util.Optional;

import com.ligabetplaypro.backend.Equipo.domain.Team;

public interface UpdateTeamUseCase {
  Optional<Team> updateTeam(Long id, Team team);
}
