package com.ligabetplaypro.backend.Equipo.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ligabetplaypro.backend.Equipo.application.port.out.TeamRepositoryPort;
import com.ligabetplaypro.backend.Equipo.domain.Team;
import com.ligabetplaypro.backend.Equipo.domain.domainServices.TeamStatsManager;

@Service
public class TeamService {
    @Autowired
    TeamRepositoryPort teamRepositoryPort;
    @Autowired
    TeamStatsManager teamStatsManager;

    public Team saveTeam(Team team) {
        return teamRepositoryPort.save(team);
    }

    public List<Team> listTeams() {
        return teamRepositoryPort.findAll();
    }

    public Team getTeam(Long teamId) {
        return teamRepositoryPort.findById(teamId).orElse(null);
    }

    public void updateMatchFinish(Team winnerTeam, Team loserTeam) {
        teamStatsManager.addVictory(winnerTeam);
        teamStatsManager.addLostMatch(loserTeam);
    }
}
