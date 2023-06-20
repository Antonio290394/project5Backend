package com.caputo.prenotazioni.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caputo.prenotazioni.models.Edificio;

public interface EdificioRepository extends JpaRepository<Edificio, Long> {

}
