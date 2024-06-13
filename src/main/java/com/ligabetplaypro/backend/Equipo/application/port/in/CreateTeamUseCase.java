package com.ligabetplaypro.backend.Equipo.application.port.in;

import com.ligabetplaypro.backend.Equipo.domain.Team;



public interface CreateTeamUseCase {
  Team createTeam(Team team);
}
