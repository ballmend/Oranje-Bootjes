package de.hhn.se.labswps.nordholland.repos;

import de.hhn.se.labswps.nordholland.model.Administrator;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AdministratorRepository extends CrudRepository<Administrator, Long> {


}
