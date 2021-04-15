package com.vn.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.vn.entity.pk.UserRoleId;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "userrole")
@IdClass(UserRoleId.class)
public class UserRole extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne
	@JoinColumn(name = "roleId")
	private Role role;

	@Id
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;

	private String other;

}