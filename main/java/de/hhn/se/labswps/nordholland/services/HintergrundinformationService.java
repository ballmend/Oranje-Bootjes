package de.hhn.se.labswps.nordholland.services;

import de.hhn.se.labswps.nordholland.model.Hintergrundinformation;
import de.hhn.se.labswps.nordholland.model.PointOfInterest;
import de.hhn.se.labswps.nordholland.repos.HintergrundinformationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HintergrundinformationService {
  private final HintergrundinformationRepository hintergrundinformationRepository;

  public HintergrundinformationService(HintergrundinformationRepository hintergrundinformationRepository) {
    this.hintergrundinformationRepository = hintergrundinformationRepository;
  }


  public Hintergrundinformation getHintergrundinformationen(int id){

    return (Hintergrundinformation) hintergrundinformationRepository.findByID(id);
  }
}
