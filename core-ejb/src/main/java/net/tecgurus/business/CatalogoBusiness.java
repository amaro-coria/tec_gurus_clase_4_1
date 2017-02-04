package net.tecgurus.business;

import java.util.List;

import javax.ejb.Local;

import net.tecgurus.common.dto.CataDTO;

@Local
public interface CatalogoBusiness {

	List<CataDTO> findAllDTO_1();

}
