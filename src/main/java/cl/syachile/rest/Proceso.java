package cl.syachile.rest;

import java.util.ArrayList;
import java.util.List;

public class Proceso {
	   public List<String> prepareList(String polno){
		   final List<String> params = new ArrayList<String>();
		   params.add(polno);
		   
		   return params;
	   }

}
