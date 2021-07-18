package mx.com.wiirux.sfgdi.controllers;

import mx.com.wiirux.sfgdi.services.SaludosService;

public class SetterInjectadoControlador {
	private SaludosService ss2;
	
	public void setSaludosService(SaludosService ss) {
		this.ss2 = ss;
	}
	
	public String getSaludos2() {
		return ss2.decirSaludos();
	}
}
