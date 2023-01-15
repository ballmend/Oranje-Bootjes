/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: wachterfr(Hochschule Heilbronn)
 * License Type: Academic
 */
package de.hhn.se.labswps.nordholland.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Hintergrundinformation")
@Data
@EqualsAndHashCode(exclude = "nameAttributeInThisClassWithOneToMany")
public class Hintergrundinformation implements Serializable {
	public Hintergrundinformation() {
	}


	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_SE_labswps_NORDHOLLAND_MODEL_HINTERGRUNDINFORMATION_ID_GENERATOR")
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_SE_labswps_NORDHOLLAND_MODEL_HINTERGRUNDINFORMATION_ID_GENERATOR", strategy="native")
	private int ID;
	
	@ManyToOne(targetEntity=de.hhn.se.labswps.nordholland.model.Weg.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="WegName", referencedColumnName="weg_name") }, foreignKey=@ForeignKey(name="FKHintergrun815329"))
	@JsonBackReference
	private de.hhn.se.labswps.nordholland.model.Weg beschriebenerWeg;
	
	@ManyToOne(targetEntity=de.hhn.se.labswps.nordholland.model.PointOfInterest.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="PointOfInterestName", referencedColumnName="poi_name") }, foreignKey=@ForeignKey(name="FKHintergrun323118"))

	private de.hhn.se.labswps.nordholland.model.PointOfInterest beschriebenerPunkt;
	
	@Column(name="Inhalt", nullable=true, length=255)	
	private String inhalt;

	@Column(name="Url", nullable=true, length=255)
	private String url;
	
	@Column(name="Bild", nullable=true, length=255)	
	private String bild;

	@Column(name="Heading", nullable=true, length=255)
	private String heading;

}
