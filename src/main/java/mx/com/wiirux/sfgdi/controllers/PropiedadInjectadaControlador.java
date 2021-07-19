package mx.com.wiirux.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import mx.com.wiirux.sfgdi.services.SaludosService;

@Controller
public class PropiedadInjectadaControlador {
	
	@Autowired
	public SaludosService ss;
	
	public String getSaludos() {
		return ss.decirSaludos();
	}
}
