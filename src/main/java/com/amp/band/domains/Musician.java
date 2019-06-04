package com.amp.band.domains;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
@RequiredArgsConstructor
public class Musician
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private final Long id;
	
	private final String username;
	
	private final String full_name;
	
	@Enumerated(EnumType.STRING)
	private final Skill skill;
	
	public static enum Skill {
		VOCALIST, BASSIST, PIANIST, GUITARIST, DRUMMER, KEYBOARDIST,MUSICIAN
	}

}