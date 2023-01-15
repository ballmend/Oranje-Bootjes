package de.hhn.se.labswps.nordholland.Ressources;

import de.hhn.se.labswps.nordholland.model.PointOfInterest;
import de.hhn.se.labswps.nordholland.services.PointOfInterestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class PointOfInterestRessource {
  private final PointOfInterestService pointOfInterestService;

  public PointOfInterestRessource(PointOfInterestService pointOfInterestService) {
    this.pointOfInterestService = pointOfInterestService;
  }

  @GetMapping("/POI")
  public ResponseEntity<List<PointOfInterest>> getAllPOIs() {

    return new ResponseEntity<>(pointOfInterestService.getAllPois(), HttpStatus.OK);
  }
}





