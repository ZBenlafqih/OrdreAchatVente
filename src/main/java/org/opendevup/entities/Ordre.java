package org.opendevup.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@SuppressWarnings("serial")
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("ORDRE")
@DiscriminatorColumn(name="TYPE_ORDRE")
public abstract class Ordre implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long idOrdre;
	private String dateOrdre;
	private int numAction;
	private double prixAction;

	@ManyToOne
	@JoinColumn(name="idSociete")
	private Societe societe;
	
	public Ordre(String dateOrdre, int numAction, double prixAction) {
		super();
		this.dateOrdre = dateOrdre;
		this.numAction = numAction;
		this.prixAction = prixAction;
	}
	public Ordre() {
		super();
	}
	//getters and setters...
	
	public Long getIdOrdre() {
		return idOrdre;
	}
	public void setIdOrdre(Long idOrdre) {
		this.idOrdre = idOrdre;
	}
	public String getDateOrdre() {
		return dateOrdre;
	}
	public void setDateOrdre(String dateOrdre) {
		this.dateOrdre = dateOrdre;
	}
	public int getNumAction() {
		return numAction;
	}
	public void setNumAction(int numAction) {
		this.numAction = numAction;
	}
	public double getPrixAction() {
		return prixAction;
	}
	public void setPrixAction(double prixAction) {
		this.prixAction = prixAction;
	}

	
}
