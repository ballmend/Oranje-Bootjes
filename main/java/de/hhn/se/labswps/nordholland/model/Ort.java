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

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
@MappedSuperclass
@Data

public abstract class Ort implements Serializable {
	public Ort() {
	}
	
	@Column(name="Breitengrad", nullable=false)	
	protected double breitengrad;
	
	@Column(name="Langengrad", nullable=false)	
	protected double langengrad;
	
	@Column(name="Hohenmeter", nullable=false)	
	protected double hohenmeter;

}
