package de.hhn.se.labswps.nordholland;

import de.hhn.se.labswps.nordholland.model.Administrator;
import de.hhn.se.labswps.nordholland.model.Hintergrundinformation;
import de.hhn.se.labswps.nordholland.model.PointOfInterest;
import de.hhn.se.labswps.nordholland.repos.AdministratorRepository;
import de.hhn.se.labswps.nordholland.repos.HintergrundinformationRepository;
import de.hhn.se.labswps.nordholland.services.AdministratorService;
import de.hhn.se.labswps.nordholland.services.PointOfInterestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class NordHollandApplication {


	public static void main(String[] args) {
	//SpringApplication.run(NordHollandApplication.class, args);


		ConfigurableApplicationContext applicationContext =SpringApplication.run(NordHollandApplication.class, args);
		PointOfInterestService x = applicationContext.getBean(PointOfInterestService.class);
		HintergrundinformationRepository hintergrundinformationRepository = applicationContext.getBean(HintergrundinformationRepository.class);


	}




}
