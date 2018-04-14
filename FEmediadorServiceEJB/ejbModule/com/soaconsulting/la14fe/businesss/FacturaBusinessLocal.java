package com.soaconsulting.la14fe.businesss;

import javax.ejb.Local;

import com.soaconsulting.la14fe.model.FacturaVO;
import com.soaconsulting.la14fe.model.StatusVO;


@Local
public interface FacturaBusinessLocal {
	
	public abstract StatusVO emitirFactura(FacturaVO facturaVO);

}
