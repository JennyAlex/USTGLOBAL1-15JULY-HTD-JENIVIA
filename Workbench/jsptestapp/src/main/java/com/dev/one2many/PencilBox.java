package com.dev.one2many;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="box")
public class PencilBox {
@Id 
@Column
private int boxid;
@Column
private  String boxname;
@Override
public String toString() {
	return "PencilBox [boxid=" + boxid + ", boxname=" + boxname + ", pen=" + pen + "]";
}
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name="boxid", nullable=false)
List<Pencil> pen ;
public int getBoxid() {
	return boxid;
}
public void setBoxid(int boxid) {
	this.boxid = boxid;
}
public String getBoxname() {
	return boxname;
}
public void setBoxname(String boxname) {
	this.boxname = boxname;
}
public List<Pencil> getPen() {
	return pen;
}
public void setPen(List<Pencil> pen) {
	this.pen = pen;
}




}
