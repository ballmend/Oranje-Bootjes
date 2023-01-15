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
@Table(name="Weg")
@Data
@EqualsAndHashCode(exclude = "ORM_detail")
public class Weg implements Serializable {
	public Weg() {
	}


	
	@Column(name="weg_name", nullable=false, length=255)
	@Id	
	private String name;
	
	@ManyToOne(targetEntity=de.hhn.se.labswps.nordholland.model.Administrator.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AdministratorLoginEmail", referencedColumnName="LoginEmail") }, foreignKey=@ForeignKey(name="legtan"))
	private de.hhn.se.labswps.nordholland.model.Administrator anleger;
	
	@Column(name="Type", nullable=true, length=10)	
	private int type;
	
	@ManyToMany(mappedBy="ORM_bearbeiteterWeg", targetEntity=de.hhn.se.labswps.nordholland.model.Administrator.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_bearbeitender = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_zugehorigerWeg", targetEntity=de.hhn.se.labswps.nordholland.model.Strecke.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_abschnitt = new java.util.HashSet();
	
	@OneToMany(mappedBy="beschriebenerWeg", targetEntity=de.hhn.se.labswps.nordholland.model.Hintergrundinformation.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_detail = new java.util.HashSet();

}
