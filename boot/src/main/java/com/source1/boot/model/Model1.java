package com.source1.boot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MODEL1")
public class Model1 {
	@Id
	private int mid;//primary key	
	private String mname;
	private String mtech;
	public int getMid() {
		return mid;
	}
	
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	@Override
	public String toString() {
		return "Model1 [mid=" + mid + ", mname=" + mname + ", mtech= " + mtech + "]";
	}
	public String getMtech() {
		return mtech;
	}
	public void setMtech(String mtech) {
		this.mtech = mtech;
	}
	

}
