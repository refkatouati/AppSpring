package tn.essat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Employe {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numempl;
	private String nomempl;
	@ManyToOne
	@JoinColumn(name="proj_id")
	private Projet proj;
	@ManyToOne
	@JoinColumn(name="dept_id")
	private Departement dept;
	
	public Employe() {
		super();
	}
	
	
	public Employe(Integer numempl, String nomempl, Projet proj, Departement dept) {
		super();
		this.numempl = numempl;
		this.nomempl = nomempl;
		this.proj = proj;
		this.dept = dept;
	}


	public Integer getNumempl() {
		return numempl;
	}
	public void setNumempl(int numempl) {
		this.numempl = numempl;
	}
	public String getNomempl() {
		return nomempl;
	}
	public void setNomempl(String nomempl) {
		this.nomempl = nomempl;
	}


	public Projet getProj() {
		return proj;
	}


	public void setProj(Projet proj) {
		this.proj = proj;
	}


	public Departement getDept() {
		return dept;
	}


	public void setDept(Departement dept) {
		this.dept = dept;
	}
	
	
}
