package com.ligabetplaypro.backend.Equipo.domain;

import jakarta.persistence.Entity;

@Entity
public class CuerpoMedico extends IntegranteEquipo {
  String titulacion;
  Integer ExperienceYears;
}
