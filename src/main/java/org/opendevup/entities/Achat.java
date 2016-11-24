package org.opendevup.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
@DiscriminatorValue("ACHAT")
public class Achat extends Ordre implements Serializable{

	public Achat() {
		super();
	}

	public Achat(String dateOrdre, int numAction, double prixAction) {
		super(dateOrdre, numAction, prixAction);
		
	}
	 
}



