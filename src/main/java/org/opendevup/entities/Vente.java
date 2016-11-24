package org.opendevup.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@SuppressWarnings("serial")
@Entity
@DiscriminatorValue("VENTE")
public class Vente extends Ordre implements Serializable{

	public Vente(String dateOrdre, int numAction, double prixAction) {
		super(dateOrdre, numAction, prixAction);
	}

	public Vente() {
		super();
	}
	
}

