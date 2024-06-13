package com.ligabetplaypro.backend.Equipo.domain;

import jakarta.persistence.Entity;

@Entity
public class CuerpoTecnico extends IntegranteEquipo {
  String cargo;
  String especialidad;
}
