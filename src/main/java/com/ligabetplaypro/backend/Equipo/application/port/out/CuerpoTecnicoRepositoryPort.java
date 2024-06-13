package com.ligabetplaypro.backend.Equipo.application.port.out;

import java.util.Optional;

import com.ligabetplaypro.backend.Equipo.domain.CuerpoTecnico;

public interface CuerpoTecnicoRepositoryPort extends IntegranteEquipoRepositoryPort<CuerpoTecnico> {

    Optional<CuerpoTecnico> findByCargo(String cargo);

    Optional<CuerpoTecnico> findByEspecialidad(String especialidad);
}
