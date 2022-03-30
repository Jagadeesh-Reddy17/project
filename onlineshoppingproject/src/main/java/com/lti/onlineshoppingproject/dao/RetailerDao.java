package com.lti.onlineshoppingproject.dao;


import java.util.List;

import com.lti.onlineshoppingproject.beans.Retailer;
import com.lti.onlineshoppingproject.exceptions.RetailerException;




public interface RetailerDao {
	public abstract int addNewRetailer(Retailer r);

	public abstract Retailer findRetailerById(int retId);
	
	public abstract String updateRetailerUserId(int retId,String rUid);
	
	public abstract void deleteRecord(int retId);
	
	public abstract List<Retailer> retailerList() throws RetailerException; 
	
	

	
}
