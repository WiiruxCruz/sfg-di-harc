package mx.com.wiirux.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import mx.com.wiirux.sfgdi.services.SaludosService;

@Controller
public class PropiedadInjectadaControlador {
	
	@Qualifier("propiedadSaludosServiceImpl")
	@Autowired
	public SaludosService ss;
	
	public String getSaludos() {
		return ss.decirSaludos();
	}
}
