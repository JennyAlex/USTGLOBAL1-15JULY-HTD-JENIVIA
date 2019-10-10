package com.dev.one2many;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity 
@Table(name= "pencil")
public class Pencil {
@Id
@Column
	private int pid;
@Column
	private String pname;



	@Override
public String toString() {
	return "Pencil [pid=" + pid + ", pname=" + pname + "]";
}



	public int getPid() {
	return pid;
}



public void setPid(int pid) {
	this.pid = pid;
}



public String getPname() {
	return pname;
}



public void setPname(String pname) {
	this.pname = pname;
}



	

}
