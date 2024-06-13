package com.ligabetplaypro.backend.Equipo.application.port.in;

import com.ligabetplaypro.backend.Equipo.domain.Team;

public interface UpdateTeamUseCase {
  Team updateTeam(Long id, Team team);
}
