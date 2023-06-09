package com.comp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comp.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long> {
	
	Cambio findByFromAndTo(String from, String to);

}
