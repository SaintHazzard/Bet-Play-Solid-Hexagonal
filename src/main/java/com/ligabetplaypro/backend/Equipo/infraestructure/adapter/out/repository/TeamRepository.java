package com.ligabetplaypro.backend.Equipo.infraestructure.adapter.out.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ligabetplaypro.backend.Equipo.application.port.out.TeamRepositoryPort;
import com.ligabetplaypro.backend.Equipo.domain.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long>, TeamRepositoryPort {

}
