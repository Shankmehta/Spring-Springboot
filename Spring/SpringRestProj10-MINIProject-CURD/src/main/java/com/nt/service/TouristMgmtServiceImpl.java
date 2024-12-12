package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Tourist;
import com.nt.repo.ITouristRepo;

@Service("touristService")
public class TouristMgmtServiceImpl implements ITouristMgmtService {

	 @Autowired 
	 private ITouristRepo touristRepo;
	@Override
	public String registerTourist(Tourist tourist) {
		int idVal=touristRepo.save(tourist).getTid();
		return "Tourist is registered having the id value::"+idVal;	
	}
	@Override 
	public List<Tourist> showAllTourists()
     {
    	 return touristRepo.findAll().stream().sorted((t1,t2)->t1.getTid()<t2.getTid()?1:-1).toList();
     }
	@Override
	  public String updateTouristDetails(Tourist tourist) throws TouristNotFoundException
	  {
		Optional<Tourist> optional=touristRepo.findById(tourist.getTid());
		if(optional.isPresent())
		{
			touristRepo.save(tourist);
			return tourist.getTid()+"Tourist is updated";
		}
		else {
			throw new TouristNotFoundException(tourist.getTid()+"Tourist not found");
		}
	  }

}
