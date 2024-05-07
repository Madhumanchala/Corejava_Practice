package com.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Alien {

	@Id
	private int Aid;
	private String Aname;
	private String Color;

	public int getAid() {
		return Aid;
	}

	public void setAid(int aid) {
		Aid = aid;
	}

	public String getAname() {
		return Aname;
	}


	public void setAname(String aname) {
		Aname = aname;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

}
