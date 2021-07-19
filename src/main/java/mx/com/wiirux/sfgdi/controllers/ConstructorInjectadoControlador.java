package mx.com.wiirux.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import mx.com.wiirux.sfgdi.services.SaludosService;

@Controller
public class ConstructorInjectadoControlador {
	private final SaludosService ss3;
	
	public ConstructorInjectadoControlador(SaludosService ss3) {
		this.ss3 = ss3;
	}
	
	public String getSaludos3() {
		return ss3.decirSaludos();
	}
}
