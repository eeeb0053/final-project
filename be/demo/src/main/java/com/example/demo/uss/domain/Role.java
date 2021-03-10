package com.example.demo.uss.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity @Table(name="roles") @Getter
@NoArgsConstructor
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_num") private long roleNum;
	@Enumerated(EnumType.STRING)
	private RoleName roleName;
	
	public Role(RoleName roleName) {
		this.roleName = roleName;
	}
}