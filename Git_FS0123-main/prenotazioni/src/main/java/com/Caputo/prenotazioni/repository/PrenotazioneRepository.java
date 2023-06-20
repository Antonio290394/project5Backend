package com.caputo.prenotazioni.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caputo.prenotazioni.models.Postazione;
import com.caputo.prenotazioni.models.Prenotazione;
import com.caputo.prenotazioni.security.entity.User;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
//	se la postazione e occupata
	List<Prenotazione> findByDataPrenotazioneAndPostazione(LocalDate dataPrenotazione, Postazione postazione);

//	se l utente ha altre prenotazioni per lo stesso giorno
	List<Prenotazione> findByDataPrenotazioneAndUser(LocalDate dataPrenotazione, User user);
}
