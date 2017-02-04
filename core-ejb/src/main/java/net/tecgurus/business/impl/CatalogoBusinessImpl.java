package net.tecgurus.business.impl;

import java.util.LinkedList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import net.tecgurus.business.CatalogoBusiness;
import net.tecgurus.common.dto.CataDTO;
import net.tecgurus.dao.CatalogoGeneralDAO_1;
import net.tecgurus.entities.CatalogoGeneral;

/**
 * Session Bean implementation class CatalogoBusinessImpl
 */
@Stateless
public class CatalogoBusinessImpl implements CatalogoBusiness {

	@EJB
    private CatalogoGeneralDAO_1 dao;
	
	@Override
	public List<CataDTO> findAllDTO_1(){
		List<CatalogoGeneral> listEntities = dao.findAllByQuery();
		List<CataDTO> listDTO  = new LinkedList<>();
		for(CatalogoGeneral c : listEntities){
			CataDTO d = new CataDTO();
			d.setDscComCat(c.getDscComCat());
			d.setDscCorCat(c.getDscCorCat());
			d.setFchCre(c.getFchCre());
			d.setIdCat(d.getIdCat());
			d.setIdEstCat(c.getIdEstCat());
			listDTO.add(d);
		}
		return listDTO;
	}

	
	
	
	
	
	
	
	
	
	
	
}
