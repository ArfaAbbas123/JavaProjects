package com.lenskartapp.dao;

import java.util.List;

import com.lenskartapp.exceptions.LensNotFoundException;
import com.lenskartapp.model.Lens;

public interface ILensDao {
	//crud operation
		void addLens(Lens lens);
		void updateLens(int lensId,double price);
		void deleteLens(int lensId);
		
		List<Lens> findAll();
		List<Lens> findByLensBrand(String lensBrand) throws LensNotFoundException;
		List<Lens> findByCategory(String category) throws LensNotFoundException;
		List<Lens> findByLensBrandAndCategory(String lensBrand,String category) throws LensNotFoundException;
		List<Lens> findByLensBrandAndPrice(String lensBrand,String price) throws LensNotFoundException;
		Lens findById(int lensId) throws LensNotFoundException;

}
