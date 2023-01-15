package de.hhn.se.labswps.nordholland.repos;



import de.hhn.se.labswps.nordholland.model.PointOfInterest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PointOfInterestRepository extends CrudRepository<PointOfInterest, String> {


}
