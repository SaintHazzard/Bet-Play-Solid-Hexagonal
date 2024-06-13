package com.ligabetplaypro.backend.Equipo.infraestructure.adapter.out.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ligabetplaypro.backend.Equipo.application.port.out.IntegranteEquipoRepositoryPort;
import com.ligabetplaypro.backend.Equipo.domain.IntegranteEquipo;

@Repository
public interface IntegranteEquipoRepository
    extends JpaRepository<IntegranteEquipo, Long>, IntegranteEquipoRepositoryPort<IntegranteEquipo> {
}
