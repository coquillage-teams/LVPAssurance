package com.everis.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plainte implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int code_Plainte;
	private int jour_Dl;
	private int mois_Dl;
	private String annee_Dl;
	private String categorieP;
	private String descriptionP;

	public Plainte() {
		super();
	}

	public Plainte(int code_Plainte, int jour_Dl, int mois_Dl, String annee_Dl, String categorieP,
			String descriptionP) {
		super();
		this.code_Plainte = code_Plainte;
		this.jour_Dl = jour_Dl;
		this.mois_Dl = mois_Dl;
		this.annee_Dl = annee_Dl;
		this.categorieP = categorieP;
		this.descriptionP = descriptionP;
	}

	public int getCode_Plainte() {
		return code_Plainte;
	}

	public void setCode_Plainte(int code_Plainte) {
		this.code_Plainte = code_Plainte;
	}

	public int getJour_Dl() {
		return jour_Dl;
	}

	public void setJour_Dl(int jour_Dl) {
		this.jour_Dl = jour_Dl;
	}

	public int getMois_Dl() {
		return mois_Dl;
	}

	public void setMois_Dl(int mois_Dl) {
		this.mois_Dl = mois_Dl;
	}

	public String getAnnee_Dl() {
		return annee_Dl;
	}

	public void setAnnee_Dl(String annee_Dl) {
		this.annee_Dl = annee_Dl;
	}

	public String getCategorieP() {
		return categorieP;
	}

	public void setCategorieP(String categorieP) {
		this.categorieP = categorieP;
	}

	public String getDescriptionP() {
		return descriptionP;
	}

	public void setDescriptionP(String descriptionP) {
		this.descriptionP = descriptionP;
	}

	@Override
	public String toString() {
		return "Plainte [code_Plainte=" + code_Plainte + ", jour_Dl=" + jour_Dl + ", mois_Dl=" + mois_Dl + ", annee_Dl="
				+ annee_Dl + ", categorieP=" + categorieP + ", descriptionP=" + descriptionP + "]";
	}



	
}
