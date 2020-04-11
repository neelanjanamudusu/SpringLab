package com.capgemini.emp;

public class TestEmployee {

	private String empname;
	private String empaddr;
	private int empsal;
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
*/	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpaddr() {
		return empaddr;
	}
	public void setEmpaddr(String empaddr) {
		this.empaddr = empaddr;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	@Override
	public String toString() {
		return "TestEmployee [empname=" + empname + ", empaddr=" + empaddr + ", empsal=" + empsal + ", getEmpname()="
				+ getEmpname() + ", getEmpaddr()=" + getEmpaddr() + ", getEmpsal()=" + getEmpsal() + "]";
	}
	public TestEmployee(String empname, String empaddr, int empsal) {
		super();
		this.empname = empname;
		this.empaddr = empaddr;
		this.empsal = empsal;
	}
	
}
