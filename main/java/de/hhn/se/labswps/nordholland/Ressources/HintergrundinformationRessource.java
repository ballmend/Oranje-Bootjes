package de.hhn.se.labswps.nordholland.Ressources;

import de.hhn.se.labswps.nordholland.model.Hintergrundinformation;
import de.hhn.se.labswps.nordholland.model.PointOfInterest;
import de.hhn.se.labswps.nordholland.services.HintergrundinformationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class HintergrundinformationRessource {
  private final HintergrundinformationService hintergrundinformationService;

  public HintergrundinformationRessource(HintergrundinformationService hintergrundinformationService) {
    this.hintergrundinformationService = hintergrundinformationService;
  }


  @GetMapping("/Hintergrundinformtaion/{id}")
  public ResponseEntity<Hintergrundinformation> getHintergrundinformation(@PathVariable("id") int id) {

    return new ResponseEntity<>(hintergrundinformationService.getHintergrundinformationen(id), HttpStatus.OK);
  }
}





