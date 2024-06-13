package com.ligabetplaypro.backend.Equipo.domain;

import jakarta.persistence.Entity;

@Entity
public class Jugador extends IntegranteEquipo {
  Integer dorsal;
  String demarcacion;
}
