package com.ms.vo;

import java.io.Serializable;

/**
 * 
 * @author palmurugan
 * 
 *         This class will have all the metadata related properties
 */
public class MetaDataVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String author;

	private String applicationName;

	private EntityDetails entityDetails;

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public EntityDetails getEntityDetails() {
		return entityDetails;
	}

	public void setEntityDetails(EntityDetails entityDetails) {
		this.entityDetails = entityDetails;
	}

}