package com.vn.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createTime;

	private String createUser;

	@Temporal(TemporalType.TIMESTAMP)
	private Calendar updateTime;
	private String updateUser;

}