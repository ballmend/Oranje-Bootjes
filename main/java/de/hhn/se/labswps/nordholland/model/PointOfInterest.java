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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="PointOfInterest")
@Data
@EqualsAndHashCode(exclude = "ORM_detail")
public class PointOfInterest extends de.hhn.se.labswps.nordholland.model.Ort implements Serializable {
	public PointOfInterest() {
	}



	@Column(name = "poi_name", nullable = false, length = 255)
	@Id
	//@GeneratedValue(generator = "DE_HHN_SE_labswps_NORDHOLLAND_MODEL_POINTOFINTEREST_NAME_GENERATOR")
	//@org.hibernate.annotations.GenericGenerator(name = "DE_HHN_SE_labswps_NORDHOLLAND_MODEL_POINTOFINTEREST_NAME_GENERATOR", strategy = "native")
	private String name;


	@ManyToOne(targetEntity = de.hhn.se.labswps.nordholland.model.Administrator.class, fetch = FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})
	@JoinColumns(value = {@JoinColumn(name = "AdministratorLoginEmail", referencedColumnName = "LoginEmail")}, foreignKey = @ForeignKey(name = "legt_an"))
	@JsonIgnore
	private de.hhn.se.labswps.nordholland.model.Administrator anleger;

	@Column(name = "Type", nullable = true, length = 10)
	private int type;

	@ManyToMany(targetEntity = de.hhn.se.labswps.nordholland.model.Administrator.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})
	@JoinTable(name = "Administrator_PointOfInterest", joinColumns = {@JoinColumn(name = "PointOfInterestName")}, inverseJoinColumns = {@JoinColumn(name = "AdministratorLoginEmail")})
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)

	private java.util.Set ORM_bearbeitender = new java.util.HashSet();

	@OneToMany(mappedBy = "beschriebenerPunkt", targetEntity = de.hhn.se.labswps.nordholland.model.Hintergrundinformation.class,fetch=FetchType.EAGER)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)
	@JsonIgnoreProperties ({"beschriebenerWeg","beschriebenerPunkt","inhalt","url","bild"})
	private java.util.Set ORM_detail = new java.util.HashSet();

}