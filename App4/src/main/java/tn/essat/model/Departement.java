package tn.essat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Departement   {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numdep;
	private String nomdep;
	
	
	public Departement() {
		super();
	}
	public Departement(int numdep, String nomdep) {
		super();
		this.numdep = numdep;
		this.nomdep = nomdep;
	}
	
	public Integer getNumdep() {
		return numdep;
	}
	public void setNumdep(Integer numdep) {
		this.numdep = numdep;
	}
	public String getNomdep() {
		return nomdep;
	}
	public void setNomdep(String nomdep) {
		this.nomdep = nomdep;
	}
	

}
