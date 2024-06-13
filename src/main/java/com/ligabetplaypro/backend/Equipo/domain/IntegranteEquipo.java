package com.ligabetplaypro.backend.Equipo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class IntegranteEquipo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;
  String nombre;
  String apellidos;
  Integer edad;

  @ManyToOne(targetEntity = Team.class)
  Team team;
}
