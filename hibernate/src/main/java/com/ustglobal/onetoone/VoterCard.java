package com.ustglobal.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Entity
@Data
@Table(name="voter")
public class VoterCard {
	@Id
	private int vid;
	@Column
	private String name;
	
	@Exclude //to exclude toString
	@OneToOne(mappedBy = "voterCard")
	private Person person;
	
	

}
