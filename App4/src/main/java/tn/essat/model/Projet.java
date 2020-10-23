package tn.essat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Projet {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numprojet;
	private String titre ;
	private String etat;
	@ManyToOne
	@JoinColumn(name="det_id")
	private Departement dept;
	public Projet() {
		super();
	}
	public Projet(Integer numprojet, String titre, String etat, Departement dept) {
		super();
		this.numprojet = numprojet;
		this.titre = titre;
		this.etat = etat;
		this.dept = dept;
	}
	public Integer getNumprojet() {
		return numprojet;
	}
	public void setNumprojet(Integer numprojet) {
		this.numprojet = numprojet;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Departement getDept() {
		return dept;
	}
	public void setDept(Departement dept) {
		this.dept = dept;
	}
	
	
}
