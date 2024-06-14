package com.ligabetplaypro.backend.Equipo.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ligabetplaypro.backend.Equipo.application.port.in.CreateTeamUseCase;
import com.ligabetplaypro.backend.Equipo.application.port.in.UpdateTeamUseCase;
import com.ligabetplaypro.backend.Equipo.application.port.out.TeamRepositoryPort;
import com.ligabetplaypro.backend.Equipo.domain.Team;
import com.ligabetplaypro.backend.Equipo.domain.domainServices.TeamStatsManager;

@Service
public class TeamService implements CreateTeamUseCase, UpdateTeamUseCase {
    @Autowired
    TeamRepositoryPort teamRepositoryPort;
    @Autowired
    TeamStatsManager teamStatsManager;

    public List<Team> listTeams() {
        return teamRepositoryPort.findAll();
    }

    public Team getTeam(Long teamId) {
        return teamRepositoryPort.findById(teamId).orElse(null);
    }

    public void updateTeamsMatchFinish(Team team1, Team team2, int team1Goals, int team2Goals) {
        if (team1Goals > team2Goals) {
            teamStatsManager.addVictory(team1);
            teamStatsManager.addLostMatch(team2);
        } else if (team1Goals < team2Goals) {
            teamStatsManager.addVictory(team2);
            teamStatsManager.addLostMatch(team1);
        } else {
            teamStatsManager.addDrawMatch(team1);
            teamStatsManager.addDrawMatch(team2);
        }
    }

    @Override
    public Team createTeam(Team team) {

        return teamRepositoryPort.save(team);
    }

    @Override
    public Optional<Team> updateTeam(Long id, Team team) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateTeam'");
    }

}
