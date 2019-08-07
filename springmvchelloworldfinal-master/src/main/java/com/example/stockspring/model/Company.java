package com.example.stockspring.model;
import java.io.*;
import java.util.*;
public class Company {
	private int company_code;
private String company_name;
private double turnOver;
private String ceo;
private String boardOfDirectors;
private String Sector;
private String briefWriteup;
private String stockCode;
public String getcompany_name() {
	return company_name;
}
public int getCompany_code() {
	return company_code;
}
public void setCompany_code(int company_code) {
	this.company_code = company_code;
}
public void setcompany_name(String company_name) {
	this.company_name = company_name;
}
public double getTurnOver() {
	return turnOver;
}
public void setTurnOver(double turnOver) {
	this.turnOver = turnOver;
}
public String getCeo() {
	return ceo;
}
public void setCeo(String ceo) {
	this.ceo = ceo;
}
public String getBoardOfDirectors() {
	return boardOfDirectors;
}
public void setBoardOfDirectors(String boardOfDirectors) {
	this.boardOfDirectors = boardOfDirectors;
}
public String getSector() {
	return Sector;
}
public void setSector(String sector) {
	Sector = sector;
}
public String getBriefWriteup() {
	return briefWriteup;
}
public void setBriefWriteup(String briefWriteup) {
	this.briefWriteup = briefWriteup;
}
public String getStockCode() {
	return stockCode;
}
public void setStockCode(String stockCode) {
	this.stockCode = stockCode;
}

public String toString() {
	return "Company [company_code=" + company_code + ", company_name=" + company_name + ", ceo=" + ceo + "]";
}

}
