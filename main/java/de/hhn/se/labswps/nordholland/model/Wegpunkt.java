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
@Table(name="Wegpunkt")
@Data

public class Wegpunkt extends de.hhn.se.labswps.nordholland.model.Ort implements Serializable {
	public Wegpunkt() {
	}

	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_SE_labswps_NORDHOLLAND_MODEL_WEGPUNKT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_SE_labswps_NORDHOLLAND_MODEL_WEGPUNKT_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToMany(targetEntity=de.hhn.se.labswps.nordholland.model.Strecke.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="wegpunkt_strecke", joinColumns={ @JoinColumn(name="WegpunktID") }, inverseJoinColumns={ @JoinColumn(name="StreckeID") })
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_verbindung = new java.util.HashSet();

	
}
