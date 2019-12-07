package com.bw.entity;
//构建实体类
public class Types {
	private Integer tid;
	private String tname;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Types(Integer tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}
	public Types() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Types [tid=" + tid + ", tname=" + tname + "]";
	}
	
}
