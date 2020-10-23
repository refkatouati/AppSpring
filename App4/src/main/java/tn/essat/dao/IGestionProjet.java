package tn.essat.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import tn.essat.model.Projet;
@Repository
public interface IGestionProjet extends JpaRepository<Projet,Integer> {
	@Query("select p from Projet p where p.dept.numdep=?1")
	public  List<Projet> getAllProjetsByDept(int id);

}
