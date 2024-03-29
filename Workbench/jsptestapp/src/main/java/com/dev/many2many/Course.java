package com.dev.many2many;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="course")
public class Course {
     @Id
     @Column
	private int cid;
     public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	} 

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Column
	private String cname;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name= "Student_Course",joinColumns= @JoinColumn(name = "cid"),
	inverseJoinColumns= @JoinColumn(name="sid"))
	private List<Student> student;
	
	
	public static void main(String[] args) {


	}

}
