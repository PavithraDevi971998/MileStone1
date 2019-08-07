package com.example.stockspring.model;
import java.io.*;
import java.util.*;
public class IPODetails {
private int id;
private String companyName;
private String stockExchange;
private double price;
private int numberOfShares;
private Date dateTime;
private String remarks;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public String getStockExchange() {
	return stockExchange;
}
public void setStockExchange(String stockExchange) {
	this.stockExchange = stockExchange;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getNumberOfShares() {
	return numberOfShares;
}
public void setNumberOfShares(int numberOfShares) {
	this.numberOfShares = numberOfShares;
}
public Date getDateTime() {
	return dateTime;
}
public void setDateTime(Date dateTime) {
	this.dateTime = dateTime;
}
public String getRemarks() {
	return remarks;
}
public void setRemarks(String remarks) {
	this.remarks = remarks;
}
}
