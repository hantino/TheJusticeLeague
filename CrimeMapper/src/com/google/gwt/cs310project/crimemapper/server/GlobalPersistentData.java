package com.google.gwt.cs310project.crimemapper.server;


import java.util.ArrayList;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import java.util.TreeMap;

import com.google.gwt.cs310project.crimemapper.client.CrimeDataByYear;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class GlobalPersistentData {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
	
	@Persistent(serialized = "true")
	private TreeMap<Integer, CrimeDataByYear> crimeDataMap = null;
	
	@Persistent(serialized = "true")
	private ArrayList<String> adminAccounts = null;

	public TreeMap<Integer, CrimeDataByYear> getCrimeDataMap() {
		return crimeDataMap;
	}

	public void setCrimeDataMap(TreeMap<Integer, CrimeDataByYear> crimeDataMap) {
		this.crimeDataMap = crimeDataMap;
	}
	
	public Long getId() {
		return this.id;
	}

	public ArrayList<String> getAdminAccounts() {
		
		return adminAccounts;
	}

	public void setAdminAccounts(ArrayList<String> adminAcct) {
		adminAccounts = adminAcct;
	}
}
