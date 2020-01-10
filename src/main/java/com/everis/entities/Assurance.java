package com.everis.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Assurance implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int num_assurance;

	private String libelleAssurance;
	private String matricule;
	private String categorieA;
	private LocalDate dateD;
	private LocalDate dateF;

	@OneToMany
	private List<Plainte> plainteA = new ArrayList<>();
	
	private Double Montant;

	public Assurance() {
		super();
	}

	public Assurance(int num_assurance, String libelleAssurance, String matricule, String categorieA, LocalDate dateD,
			LocalDate dateF, List<Plainte> plainteA, Double montant) {
		super();
		this.num_assurance = num_assurance;
		this.libelleAssurance = libelleAssurance;
		this.matricule = matricule;
		this.categorieA = categorieA;
		this.dateD = dateD;
		this.dateF = dateF;
		this.plainteA = plainteA;
		Montant = montant;
	}

	public int getNum_assurance() {
		return num_assurance;
	}

	public void setNum_assurance(int num_assurance) {
		this.num_assurance = num_assurance;
	}

	public String getLibelleAssurance() {
		return libelleAssurance;
	}

	public void setLibelleAssurance(String libelleAssurance) {
		this.libelleAssurance = libelleAssurance;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getCategorieA() {
		return categorieA;
	}

	public void setCategorieA(String categorieA) {
		this.categorieA = categorieA;
	}

	public LocalDate getDateD() {
		return dateD;
	}

	public void setDateD(LocalDate dateD) {
		this.dateD = dateD;
	}

	public LocalDate getDateF() {
		return dateF;
	}

	public void setDateF(LocalDate dateF) {
		this.dateF = dateF;
	}

	public List<Plainte> getPlainteA() {
		return plainteA;
	}

	public void setPlainteA(List<Plainte> plainteA) {
		this.plainteA = plainteA;
	}

	public Double getMontant() {
		return Montant;
	}

	public void setMontant(Double montant) {
		Montant = montant;
	}

	@Override
	public String toString() {
		return "Assurance [num_assurance=" + num_assurance + ", libelleAssurance=" + libelleAssurance + ", matricule="
				+ matricule + ", categorieA=" + categorieA + ", dateD=" + dateD + ", dateF=" + dateF + ", plainteA="
				+ plainteA + ", Montant=" + Montant + "]";
	}


}
