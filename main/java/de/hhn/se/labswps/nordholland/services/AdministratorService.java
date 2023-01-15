package de.hhn.se.labswps.nordholland.services;

import de.hhn.se.labswps.nordholland.model.Administrator;
import de.hhn.se.labswps.nordholland.repos.AdministratorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdministratorService {
  private final AdministratorRepository administratorRepository;

  public AdministratorService(AdministratorRepository administratorRepository) {
    this.administratorRepository = administratorRepository;
  }

  public List<Administrator> get(){
    return (List<Administrator>) administratorRepository.findAll();
  }
  public void save(Administrator admin){
    administratorRepository.save(admin);
  }
}
