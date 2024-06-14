package com.ligabetplaypro.backend.Match.infraestructure.out.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ligabetplaypro.backend.Match.domain.Match;

public interface MatchRepository extends JpaRepository<Match, Long> {

}
