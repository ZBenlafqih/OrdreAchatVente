package org.opendevup.dao;

import org.opendevup.entities.Vente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenteRepository extends JpaRepository<Vente, Long>{
	
}

