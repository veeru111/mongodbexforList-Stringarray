package com.app.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Book {
	
	@Id
	private String id;
	private String Name;
	private String author;
	private Double price;
	private List<String> list;
	private String[] code;
	private Map<String,String> map;
	private Properties pro;
	
	
	public Book(String name, String author, Double price, Map<String, String> map, Properties pro) {
		super();
		Name = name;
		this.author = author;
		this.price = price;
		this.map = map;
		this.pro = pro;
	}
	public Book(String name, String author, Double price) {
		super();
		Name = name;
		this.author = author;
		this.price = price;
	}
	public Book(String name, String author, Double price, List<String> list, String[] code) {
		super();
		Name = name;
		this.author = author;
		this.price = price;
		this.list = list;
		this.code = code;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public String[] getCode() {
		return code;
	}
	public void setCode(String[] code) {
		this.code = code;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public Properties getPro() {
		return pro;
	}
	public void setPro(Properties pro) {
		this.pro = pro;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", Name=" + Name + ", author=" + author + ", price=" + price + ", list=" + list
				+ ", code=" + Arrays.toString(code) + ", map=" + map + ", pro=" + pro + "]";
	}
	
	
	
	
	

}
