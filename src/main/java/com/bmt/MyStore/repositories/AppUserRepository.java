package com.bmt.MyStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bmt.MyStore.models.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser,Integer> {
	
	public default  AppUser findByRegnumber(String regnumber) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
