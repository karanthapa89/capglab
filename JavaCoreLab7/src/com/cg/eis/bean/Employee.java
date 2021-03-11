package com.cg.eis.bean;

public class Employee {

	private int eid;
	private String ename;
	private double esal;
	private String edesig;
	private String ischeme;
	
	public Employee(int eid, String ename, double esal, String edesig, String ischeme)
	{
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.edesig = edesig;
		this.ischeme = ischeme;
	}
		
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	public String getEdesig() {
		return edesig;
	}

	public void setEdesig(String edesig) {
		this.edesig = edesig;
	}

	public String getIscheme() {
		return ischeme;
	}

	public void setIscheme(String ischeme) {
		this.ischeme = ischeme;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edesig=" + edesig + ", ischeme="
				+ ischeme + "]";
	}
		
}
