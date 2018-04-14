package com.soaconsulting.la14fe.businesss;

import javax.ejb.Local;
import com.soaconsulting.la14fe.model.StatusVO;

@Local
public interface EmisionQueueControlLocal {
	
	public StatusVO addColaEmision(String factura);

}
