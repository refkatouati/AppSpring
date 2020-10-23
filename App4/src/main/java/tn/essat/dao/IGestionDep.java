package tn.essat.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.essat.model.Departement;
@Repository
public interface IGestionDep extends JpaRepository<Departement,Integer> {

}
