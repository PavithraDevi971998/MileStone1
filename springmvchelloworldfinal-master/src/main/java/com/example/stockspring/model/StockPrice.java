package com.example.stockspring.model;
import java.io.*;
import java.util.*;
public class StockPrice {
private int company_code;
private int stock_exchange;
private double current_price;
private String date;
private String time;
public int getcompany_code() {
	return company_code;
}
public void setcompany_code(int company_code) {
	this.company_code = company_code;
}
public int getstock_exchange() {
	return stock_exchange;
}
public void setstock_exchange(int stock_exchange) {
	this.stock_exchange = stock_exchange;
}
public double getcurrent_price() {
	return current_price;
}
public void setcurrent_price(double current_price) {
	this.current_price = current_price;
}     
public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
@Override
public String toString() {
	return "StockPrice [company_code=" + company_code + ", stock_exchange=" + stock_exchange + ", current_price="
			+ current_price + ", date=" + date + ", time=" + time + "]";
}
}
