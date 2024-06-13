package com.ligabetplaypro.backend.Equipo.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ligabetplaypro.backend.Equipo.application.port.out.CuerpoMedicoRepositoryPort;
import com.ligabetplaypro.backend.Equipo.domain.CuerpoMedico;

@Repository
public interface CuerpoMedicoRepository extends JpaRepository<CuerpoMedico, Long>, CuerpoMedicoRepositoryPort {

}