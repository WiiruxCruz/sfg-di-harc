package mx.com.wiirux.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import mx.com.wiirux.sfgdi.services.SaludosService;

@Controller
public class SetterInjectadoControlador {
	private SaludosService ss2;
	
	@Qualifier("setterSaludosServiceImpl")
	@Autowired
	public void setSaludosService(SaludosService ss) {
		this.ss2 = ss;
	}
	
	public String getSaludos2() {
		return ss2.decirSaludos();
	}
}
