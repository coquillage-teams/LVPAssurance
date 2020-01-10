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
public class Client implements Serializable {

	@Id
	private String CinC;

	private String nom;
	private String prenom;
	private String sexe;
	private LocalDate dateN;
	private String adresse;
	private String ville;
	private String nationalité;
	private String num_tel;
	private String categorieC;
	@OneToMany
	private List<Assurance> assurance = new ArrayList<>();


	public Client() {
		super();
	}


	public Client(String cinC, String nom, String prenom, String sexe, LocalDate dateN, String adresse, String ville,
			String nationalité, String num_tel, String categorieC, List<Assurance> assurance) {
		super();
		CinC = cinC;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.dateN = dateN;
		this.adresse = adresse;
		this.ville = ville;
		this.nationalité = nationalité;
		this.num_tel = num_tel;
		this.categorieC = categorieC;
		this.assurance = assurance;
	}


	public String getCinC() {
		return CinC;
	}


	public void setCinC(String cinC) {
		CinC = cinC;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getSexe() {
		return sexe;
	}


	public void setSexe(String sexe) {
		this.sexe = sexe;
	}


	public LocalDate getDateN() {
		return dateN;
	}


	public void setDateN(LocalDate dateN) {
		this.dateN = dateN;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getNationalité() {
		return nationalité;
	}


	public void setNationalité(String nationalité) {
		this.nationalité = nationalité;
	}


	public String getNum_tel() {
		return num_tel;
	}


	public void setNum_tel(String num_tel) {
		this.num_tel = num_tel;
	}


	public String getCategorieC() {
		return categorieC;
	}


	public void setCategorieC(String categorieC) {
		this.categorieC = categorieC;
	}


	public List<Assurance> getAssurance() {
		return assurance;
	}


	public void setAssurance(List<Assurance> assurance) {
		this.assurance = assurance;
	}


	@Override
	public String toString() {
		return "Client [CinC=" + CinC + ", nom=" + nom + ", prenom=" + prenom + ", sexe=" + sexe + ", dateN=" + dateN
				+ ", adresse=" + adresse + ", ville=" + ville + ", nationalité=" + nationalité + ", num_tel=" + num_tel
				+ ", categorieC=" + categorieC + ", assurance=" + assurance + "]";
	}

	

	

}
