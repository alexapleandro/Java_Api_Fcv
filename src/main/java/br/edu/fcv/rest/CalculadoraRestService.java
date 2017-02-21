package br.edu.fcv.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/calculadora")
public class CalculadoraRestService {

	
	@GET
	@Path("/soma/{param1}/{param2}")
	public Response soma(@PathParam("param1") Integer num1, @PathParam("param2") Integer num2){
		String result = "Resultado da soma: " + (num1 + num2);
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path("/subtracao/{param1}/{param2}")
	public Response subtracao(@PathParam("param1") Integer num1, @PathParam("param2") Integer num2){
		String result = "Resultado da subtracao: " + (num1 - num2);
		return Response.status(200).entity(result).build();
	}
	
	@POST
	@Path("/divisao/{param1}/{param2}")
	public Response dividir(@PathParam("param1") Integer num1, @PathParam("param2") Integer num2){
		String result = "Resultado da divisao: " + (num1 / num2);
		return Response.status(200).entity(result).build();
	}
	
	@POST
	@Path("/multiplicacao/{param1}/{param2}")
	public Response multiplicacao(@PathParam("param1") Integer num1, @PathParam("param2") Integer num2){
		String result = "Resultado da multiplicacao: " + (num1 * num2);
		return Response.status(200).entity(result).build();
	}
	
	

}
