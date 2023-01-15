package de.hhn.se.labswps.nordholland.services;

import de.hhn.se.labswps.nordholland.model.PointOfInterest;
import de.hhn.se.labswps.nordholland.repos.PointOfInterestRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PointOfInterestService {
  private final PointOfInterestRepository pointOfInterestRepository;


  public PointOfInterestService(PointOfInterestRepository pointOfInterestRepository) {
    this.pointOfInterestRepository = pointOfInterestRepository;
  }

  public List<PointOfInterest> getAllPois(){

    return (List<PointOfInterest>) pointOfInterestRepository.findAll();
  }
}
