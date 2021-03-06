package com.genesis.party.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.genesis.common.domain.Auditable;

/**
 * 
 * @author PalMurugan C
 *
 */
@Entity
@Table(name = "PARTY")
public class Party extends Auditable<String> implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 6522743995547647129L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PARTY_ID", unique = true, nullable = false)
    private Long partyId;

	@ManyToOne()
	@JoinColumn(name = "PARTY_TYPE_ID")
    private PartyType partyType;

    public Party() {
        super();
    }

    public Party(PartyType partyType) {
        super();
        this.partyType = partyType;
    }

    public Long getPartyId() {
        return partyId;
    }

    public void setPartyId(Long partyId) {
        this.partyId = partyId;
    }

    public PartyType getPartyType() {
        return partyType;
    }

    public void setPartyType(PartyType partyType) {
        this.partyType = partyType;
    }

    @Override
    public String toString() {
        return "Party [partyId=" + partyId + ", partyType=" + partyType + "]";
    }
}
