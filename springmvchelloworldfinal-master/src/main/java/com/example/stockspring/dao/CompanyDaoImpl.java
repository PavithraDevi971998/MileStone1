package com.example.stockspring.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.stockspring.model.Company;

@Repository
public class CompanyDaoImpl implements CompanyDao{

	public void insertCompany(Company company) throws SQLException  {
		
	}
	public List<Company> getCompanyList() throws SQLException {
		List <Company> companyList=new ArrayList<Company>();
		try{
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/stock","root","root");
		PreparedStatement ps=conn.prepareStatement("select * from company");
		ResultSet rs=	ps.executeQuery();
		Company company=null;
		while(rs.next()){
			 company=new Company();
			 company.setCompany_code(rs.getInt("company_code"));
			 company.setcompany_name(rs.getString("company_name"));
			company.setTurnOver(rs.getInt("turnOver"));
			company.setCeo(rs.getString("ceo"));
			company.setBoardOfDirectors(rs.getString("boardofdirectors"));
			company.setBriefWriteup(rs.getString("briefWriteup"));
			company.setStockCode(rs.getString("stockCode"));
			companyList.add(company);
		}
		}catch(SQLException e){
			System.out.println(e);
			throw e;
		}
		return companyList;
	}

	
	
	
	
	
	
	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String []args) throws Exception{
		CompanyDaoImpl dao=new CompanyDaoImpl();
		//Company compnay=new Company();
		//compnay.setCompanyId(1001);
		//dao.insertCompany(compnay);
		
		System.out.println(dao.getCompanyList());
	}

}
