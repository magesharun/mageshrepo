package com.jsp.eager;

public class Vegetables 
{
	private String Vname;
	private int Vid;
	public String getVname() {
		return Vname;
	}
	public void setVname(String vname) {
		Vname = vname;
	}
	public int getVid() {
		return Vid;
	}
	public void setVid(int vid) {
		Vid = vid;
	}
	@Override
	public String toString() {
		return "Vegetables [Vname=" + Vname + ", Vid=" + Vid + "]";
	}

}
