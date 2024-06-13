package com.ligabetplaypro.backend.Equipo.application.port.out;

import java.util.Optional;

import com.ligabetplaypro.backend.Equipo.domain.CuerpoMedico;

public interface CuerpoMedicoRepositoryPort extends IntegranteEquipoRepositoryPort<CuerpoMedico> {

  Optional<CuerpoMedico> findByTitulacion(String titulacion);

  Optional<CuerpoMedico> findByExperienceYears(Integer experienceYears);
}
