package org.opendevup.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Societe implements Serializable{
	
	@Id @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	private String codeSociete;
	private String nomSociete;
	
	@OneToMany(mappedBy="societe",fetch=FetchType.LAZY)
	private Collection<Ordre> ordres;
	
	public Societe() {
		super();
	}

	
	public Societe(String codeSociete) {
		super();
		this.codeSociete = codeSociete;
	}




	//getters and setters...
	
	
	public String getCodeSociete() {
		return codeSociete;
	}

	public void setCodeSociete(String codeSociete) {
		this.codeSociete = codeSociete;
	}

	public String getNomSociete() {
		return nomSociete;
	}

	public void setNomSociete(String nomSociete) {
		this.nomSociete = nomSociete;
	}

	public Collection<Ordre> getOrdres() {
		return ordres;
	}

	public void setOrdres(Collection<Ordre> ordres) {
		this.ordres = ordres;
	}


	
	
}
