package com.nt.service;

import java.util.List;

import com.nt.entity.Tourist;

public interface ITouristMgmtService 
{
     public String registerTourist(Tourist tourist);
     
  public List<Tourist> showAllTourists();
  
  public String updateTouristDetails(Tourist tourist)throws TouristNotFoundException;
     
}

