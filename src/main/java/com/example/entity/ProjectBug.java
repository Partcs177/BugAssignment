package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class ProjectBug {
       @Id
       @GeneratedValue(strategy = GenerationType.AUTO)
       private Integer projectid;
       private String projectname;
       private String description;
       private String createddate;
       private String completeddate;
       
       
       

   	@OneToOne(cascade = CascadeType.ALL)
   	@JoinColumn(name="starterid", referencedColumnName = "starterid")
   	StarterBug starter;
	public StarterBug getStarter() {
		return starter;
	}
	public void setStarter(StarterBug starter) {
		this.starter = starter;
	}
	public Integer getProjectid() {
		return projectid;
	}
	public void setProjectid(Integer projectid) {
		this.projectid = projectid;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreateddate() {
		return createddate;
	}
	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}
	public String getCompleteddate() {
		return completeddate;
	}
	public void setCompleteddate(String completeddate) {
		this.completeddate = completeddate;
	}
}
