package mx.com.wiirux.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import mx.com.wiirux.sfgdi.services.SaludosService;

@Controller
public class i18nControlador {
	private final SaludosService ss;
	
	public i18nControlador(
		@Qualifier("i18nService")	
		SaludosService ss
	) {
		this.ss = ss;
	}
	
	public String decirHola() {
		return ss.decirSaludos();
	}
	
}
