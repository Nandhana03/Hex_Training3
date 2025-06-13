package com.spring.library;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Book {
	
//	public Book() {};
//       
//	public Book(int bookCode, String name, double price) {
//		super();
//		this.bookCode = bookCode;
//		this.name = name;
//		this.price = price;
//	}
//	
//	private int bookCode;
//	private String name;
//	private double price;
//	Dept d;
//	public Dept getD() {
//		return d;
//	}
//
//	public void setD(Dept d) {
//		this.d = d;
//	}
//
//	public int getBookCode() {
//		return bookCode;
//	}
//	public void setBookCode(int bookCode) {
//		this.bookCode = bookCode;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public double getPrice() {
//		return price;
//	}
//	public void setPrice(double price) {
//		this.price = price;
//	}
//	@Override
//	public String toString() {
//		return "Book [bookCode=" + bookCode + ", name=" + name + ", price=" + price + "]";
//	}
////	
////	void init()
////	{
////		
////		System.out.println("Starting .....");
////	}
////	
////	void destroy()
////	{
////		
////		System.out.println("Ending  .....");
////	}
//
////	@Override
////	public void destroy() throws Exception {
////		System.out.println("Ending...");
////		
////	}
////
////	@Override
////	public void afterPropertiesSet() throws Exception {
//////		 TODO Auto-generated method stub
////	   System.out.println("Starting...");	 
////		
////	}
//	
//	@PostConstruct
//	void start()
//	{
//		System.out.println("starting ...");
//	}
//		
//	@PreDestroy()
//	void stop()
//	{
//		System.out.println("ending  ...");
//	}
//    
	int code;
	String name;
	double price;
	List <String> cityList;
	
	Book()
	{
		
	}
 
	public int getCode() {
		return code;
	}
 
	public void setCode(int code) {
		this.code = code;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public double getPrice() {
		return price;
	}
 
	public void setPrice(double price) {
		this.price = price;
	}
 
	public List<String> getCityList() {
		return cityList;
	}
 
	public void setCityList(List<String> cityList) {
		this.cityList = cityList;
	}
 
	public Book(int code, String name, double price, List<String> cityList) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.cityList = cityList;
	}
    
	Map<String, Integer> sales;
	
	public Map<String, Integer> getSales() {
        return sales;
    }

    public void setSales(Map<String, Integer> sales) {
        this.sales = sales;
    } 
    
	@Override
	public String toString() {
		return "Book [code=" + code + ", name=" + name + ", price=" + price + ", cityList=" + cityList + "]";
	}
	
}
