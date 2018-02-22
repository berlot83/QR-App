package com.molokotech.utilities;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.molokotech.model.Building;

@Path("fromJson")
public class FomJsonToPDF {

	@Path("toPDF")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String fromJSonToPDF(@FormParam("reference") String reference, @FormParam("m2Covered") int m2Covered, @FormParam("m2Uncovered") int m2Uncovered, @FormParam("price") double price, @FormParam("status") String status) {
		
		Gson gson = new Gson();
		
		try {
			
		}catch(Exception ex) {
			
		}
		
		String responseToJson = gson.toJson(new Building(reference, m2Covered, m2Uncovered, price, status));
		return responseToJson;
	}
	
}
