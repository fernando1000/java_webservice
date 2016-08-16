package br.com.ws;

import javax.xml.ws.Endpoint;

public class EndPointWS {

	public static void main(String [] args){
		
		WSservidor estoqueWS = new WSservidor();
	
		Endpoint.publish("http://localhost:8081/teste", estoqueWS);
		
		System.out.println("EstoqueWS rodando...");
	}
}
