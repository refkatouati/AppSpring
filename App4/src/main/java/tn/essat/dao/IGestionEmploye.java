package tn.essat.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.essat.model.Employe;
@Repository
public interface IGestionEmploye  extends JpaRepository<Employe,Integer>{
	@Query("select e from Employe e where e.dept.id=?1")
	public List<Employe> getAllEmployByDep(int id);
	@Query ("select e from Employe e where e.proj.id=:x")
	public List<Employe> getAllEmpByProj(@Param("x")int id);

}
