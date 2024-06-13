package com.ligabetplaypro.backend.Equipo.infraestructure.adapter.out.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ligabetplaypro.backend.Equipo.application.port.out.CuerpoTecnicoRepositoryPort;
import com.ligabetplaypro.backend.Equipo.domain.CuerpoTecnico;

@Repository
public interface CuerpoTecnicoRepository extends JpaRepository<CuerpoTecnico, Long>, CuerpoTecnicoRepositoryPort {
}
