package com.jsp.eager;

public class Fruits 
{
	private String Fname;
	private int Fid;
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public int getFid() {
		return Fid;
	}
	public void setFid(int fid) {
		Fid = fid;
	}
	@Override
	public String toString() {
		return "Fruits [Fname=" + Fname + ", Fid=" + Fid + "]";
	}
	 

}
