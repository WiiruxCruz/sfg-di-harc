package mx.com.wiirux.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import mx.com.wiirux.sfgdi.services.SaludosService;

@Controller
public class MiControlador {
	
	//Esta es la mejor practica
	private final SaludosService ssPrimario;
	
	public MiControlador( SaludosService ss) {
		this.ssPrimario = ss;
	}
	
	public String decirHola() {
		//System.out.println("Hola mundo!");
		
		return ssPrimario.decirSaludos();
	}
}
