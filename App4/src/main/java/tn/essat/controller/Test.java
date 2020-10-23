package tn.essat.controller;

import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import tn.essat.dao.IGestionDep;
import tn.essat.dao.IGestionEmploye;
import tn.essat.dao.IGestionProjet;
import tn.essat.model.Departement;
import tn.essat.model.Employe;
import tn.essat.model.Projet;

@Controller
public class Test {
	@Autowired
	IGestionEmploye daoemp;
	@Autowired
	IGestionDep daodep;
	@Autowired
	IGestionProjet daoproj;

	public void setDaodep(IGestionDep daodep) {
		this.daodep = daodep;
	}

	public void setDaoproj(IGestionProjet daoproj) {
		this.daoproj = daoproj;
	}

	public void setDaoemp(IGestionEmploye daoemp) {
		this.daoemp = daoemp;
	}

	@GetMapping("/home")
	public String get1(Model m) {
		List<Departement> liste = daodep.findAll();
		m.addAttribute("liste", liste);
		return "page1";

	}

	@GetMapping("/addProj")
	public String get2(Model m) {
		Projet p = new Projet();
		List<Departement> depts = daodep.findAll();
		m.addAttribute("pr", p);
		m.addAttribute("depts", depts);
		return "ajout";
	}

	@PostMapping("/saveProjet")
	public String get3(Model m, @ModelAttribute("pr") Projet p)

	{
		daoproj.save(p);
		return "redirect:/home";
	}

	@GetMapping("/projets/{id}")
	public String get4(Model m, @PathVariable("id") int id) {
		List<Projet> liste = daoproj.getAllProjetsByDept(id);
		Departement d = daodep.findOne(id);
		m.addAttribute("d", d);
		m.addAttribute("liste", liste);
		return "projets";
	}
	
	@GetMapping("employes/{id}")
	public String get5(Model m, @PathVariable("id") int id) {
		List<Employe> liste = daoemp.getAllEmployByDep( id);
		m.addAttribute("liste", liste);
		
		Departement d = daodep.findOne(id);
		m.addAttribute("d", d);
		
		
		return "employes";
	}

	@GetMapping("/addEmploye")
	public String get5(Model m) {
		Employe e = new Employe();
		m.addAttribute("e", e);
		List<Departement> depts = daodep.findAll();
		List<Projet> prs = daoproj.findAll();
		m.addAttribute("prs", prs);
		m.addAttribute("depts", depts);
		return "ajoutempl";
	}

	@PostMapping("/saveEmploye")
	public String get6(Model m, @ModelAttribute("e") Employe e)

	{
		daoemp.save(e);
		return "redirect:/home";
	}
}
