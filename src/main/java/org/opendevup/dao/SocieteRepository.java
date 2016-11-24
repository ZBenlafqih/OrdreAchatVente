package org.opendevup.dao;

import org.opendevup.entities.Societe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

public interface SocieteRepository extends JpaRepository<Societe, String> {
	@Query("select s from Societe s where s.nomSociete like :x")
	public Page<Societe> societesParMC(@Param("x")  String mc, Pageable pageable);
	
}
