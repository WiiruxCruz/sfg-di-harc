package mx.com.wiirux.sfgdi.controllers;

import mx.com.wiirux.sfgdi.services.SaludosService;

public class ConstructorInjectadoControlador {
	private final SaludosService ss3;
	
	public ConstructorInjectadoControlador(SaludosService ss3) {
		this.ss3 = ss3;
	}
	
	public String getSaludos3() {
		return ss3.decirSaludos();
	}
}
