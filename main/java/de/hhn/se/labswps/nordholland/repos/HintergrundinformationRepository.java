package de.hhn.se.labswps.nordholland.repos;



import de.hhn.se.labswps.nordholland.model.Hintergrundinformation;
import de.hhn.se.labswps.nordholland.model.PointOfInterest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface HintergrundinformationRepository extends CrudRepository<Hintergrundinformation, Integer> {
  Hintergrundinformation findByID(int ID);


}
