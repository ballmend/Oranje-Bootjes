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
@Table(name="Administrator")
@Data
@EqualsAndHashCode(exclude = {"ORM_angelegterPoi","ORM_angelegterWeg"})
public class Administrator implements Serializable {
	public Administrator() {
	}


	@Column(name = "LoginEmail", nullable = false, length = 255)
	@Id
	private String loginEmail;

	@Column(name = "LoginName", nullable = true, length = 255)
	private String loginName;

	@Column(name = "LoginPasswort", nullable = true, length = 255)
	private String loginPasswort;

	@ManyToMany(targetEntity = de.hhn.se.labswps.nordholland.model.Weg.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})
	@JoinTable(name = "Weg_Administrator", joinColumns = {@JoinColumn(name = "AdministratorLoginEmail")}, inverseJoinColumns = {@JoinColumn(name = "WegName")})
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)
	private java.util.Set ORM_bearbeiteterWeg = new java.util.HashSet();

	@OneToMany(mappedBy = "anleger", targetEntity = de.hhn.se.labswps.nordholland.model.PointOfInterest.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)
	private java.util.Set ORM_angelegterPoi = new java.util.HashSet();

	@OneToMany(mappedBy = "anleger", targetEntity = de.hhn.se.labswps.nordholland.model.Weg.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)
	private java.util.Set ORM_angelegterWeg = new java.util.HashSet();

	@ManyToMany(mappedBy = "ORM_bearbeitender", targetEntity = de.hhn.se.labswps.nordholland.model.PointOfInterest.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)
	private java.util.Set ORM_bearbeiteterPoi = new java.util.HashSet();
}
