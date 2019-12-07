package com.bw.entity;
//构建实体类
public class Goods {
	 private Integer id ;
	 private String name;
	 private String datea;
	 private Integer tid ;
	 private Integer status ;
	 private Integer bid;
	 private String bname ;
	 private double price;
	 private String tname;
	 
	 
	public Goods(Integer id, String name, String datea, Integer tid,
			Integer status, Integer bid, String bname, double price,
			String tname) {
		super();
		this.id = id;
		this.name = name;
		this.datea = datea;
		this.tid = tid;
		this.status = status;
		this.bid = bid;
		this.bname = bname;
		this.price = price;
		this.tname = tname;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Goods(Integer id, String name, String datea, Integer tid,
			Integer status, String bname, double price, String tname) {
		super();
		this.id = id;
		this.name = name;
		this.datea = datea;
		this.tid = tid;
		this.status = status;
		this.bname = bname;
		this.price = price;
		this.tname = tname;
	}
	
	
	public Goods(Integer id, String name, String datea, Integer tid,
			Integer status, Integer bid, double price) {
		super();
		this.id = id;
		this.name = name;
		this.datea = datea;
		this.tid = tid;
		this.status = status;
		this.bid = bid;
		this.price = price;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDatea() {
		return datea;
	}
	public void setDatea(String datea) {
		this.datea = datea;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Goods(Integer id, String name, String datea, Integer tid,
			Integer status, String bname, double price) {
		super();
		this.id = id;
		this.name = name;
		this.datea = datea;
		this.tid = tid;
		this.status = status;
		this.bname = bname;
		this.price = price;
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", datea=" + datea
				+ ", tid=" + tid + ", status=" + status + ", bname=" + bname
				+ ", price=" + price + "]";
	}
	 
	 
	
}
