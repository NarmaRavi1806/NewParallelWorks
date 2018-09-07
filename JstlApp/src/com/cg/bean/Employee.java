package com.cg.bean;

public class Employee {
	
	private int id;
	private String ename;
	private Double sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Employee(int id, String ename, Double sal) {
		super();
		this.id = id;
		this.ename = ename;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", sal=" + sal + "]";
	}
	

}
