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

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Strecke")
@Data
@EqualsAndHashCode(exclude = "nameAttributeInThisClassWithOneToMany")
public class Strecke implements Serializable {
	public Strecke() {
	}

	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_SE_labswps_NORDHOLLAND_MODEL_STRECKE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_SE_labswps_NORDHOLLAND_MODEL_STRECKE_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="GeschwindigkeitsBegrenzung", nullable=false, length=10)	
	private int geschwindigkeitsBegrenzung;
	
	@ManyToMany(targetEntity=de.hhn.se.labswps.nordholland.model.Weg.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Weg_Strecke", joinColumns={ @JoinColumn(name="StreckeID") }, inverseJoinColumns={ @JoinColumn(name="WegName") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_zugehorigerWeg = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_verbindung", targetEntity=de.hhn.se.labswps.nordholland.model.Wegpunkt.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_endpunkt = new java.util.HashSet();


}
