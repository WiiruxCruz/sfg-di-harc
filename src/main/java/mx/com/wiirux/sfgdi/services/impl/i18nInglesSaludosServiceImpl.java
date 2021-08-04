package mx.com.wiirux.sfgdi.services.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import mx.com.wiirux.sfgdi.repositories.SaludoInglesRepository;
import mx.com.wiirux.sfgdi.services.SaludosService;

public class i18nInglesSaludosServiceImpl implements SaludosService {
	
	private final SaludoInglesRepository sir;
	
	public i18nInglesSaludosServiceImpl(SaludoInglesRepository sir) {
		this.sir = sir;
	}

	@Override
	public String decirSaludos() {
		// TODO Auto-generated method stub
		return "Hello World! - EN";
	}

}
