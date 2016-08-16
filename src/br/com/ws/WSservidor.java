package br.com.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class WSservidor {
    
    @WebMethod(operationName="WebMethod_logarUsuario")
    @WebResult(name="WebResult_logouCom")
    public String cadItem(@WebParam(name="WebParam_noCabecalho_usuario", header=true) String usuario, @WebParam(name="WebParam_senha") String senha){

    	String resposta = "recebido o usuario: " + usuario + " com a senha: " + senha;
        
    	System.out.println(resposta);
        
    	return resposta;           
    }
}
