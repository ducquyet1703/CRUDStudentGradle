package com.example.crudstudentgradle.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Data
@Table(name = "student")
public class Student {
	@Id
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "class")
	private String class_name;
	@Column(name = "birth")
	private Date birth;
	@Column(name = "score")
	private Float score;
}
