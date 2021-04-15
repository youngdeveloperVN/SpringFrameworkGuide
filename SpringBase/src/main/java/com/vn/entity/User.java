package com.vn.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private Boolean enable;

	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private List<UserRole> userRole;

}