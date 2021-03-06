package com.genesis.party.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.genesis.common.annotation.Unique;
import com.genesis.common.domain.Auditable;
import com.genesis.common.validator.ValidationGroup;
import com.genesis.party.service.impl.PartyTypeService;

/**
 * 
 * @author PalMurugan C
 *
 */
@Entity
@Table(name = "PARTY_TYPE")
public class PartyType extends Auditable<String> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2627086124301570090L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PARTY_TYPE_ID", unique = true, nullable = false)
	private Long partyTypeId;

	@Column(name = "NAME", nullable = false, unique = true)
	@NotNull(message = "party type name should not be null")
	@NotBlank(message = "party type name should not be empty")
	@Unique(groups = {
			ValidationGroup.ValidateWhileCreate.class }, service = PartyTypeService.class, fieldName = "name", message = "Party type name should not be duplicate")
	private String name;

	public PartyType(Long partyTypeId) {
		super();
		this.partyTypeId = partyTypeId;
	}

	public PartyType(Long partyTypeId, String name) {
		super();
		this.partyTypeId = partyTypeId;
		this.name = name;
	}

	public PartyType(String name) {
		super();
		this.name = name;
	}

	public PartyType() {
		super();
	}

	public Long getPartyTypeId() {
		return partyTypeId;
	}

	public void setPartyTypeId(Long partyTypeId) {
		this.partyTypeId = partyTypeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
