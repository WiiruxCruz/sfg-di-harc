package mx.com.wiirux.sfgdi.controllers;

import mx.com.wiirux.sfgdi.services.SaludosService;

public class PropiedadInjectadaControlador {
	public SaludosService ss;
	
	public String getSaludos() {
		return ss.decirSaludos();
	}
}
