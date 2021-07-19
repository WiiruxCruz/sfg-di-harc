package mx.com.wiirux.sfgdi.services.impl;

import org.springframework.stereotype.Service;

import mx.com.wiirux.sfgdi.services.SaludosService;

@Service
public class ConstructorSaludosServiceImpl implements SaludosService {

	@Override
	public String decirSaludos() {
		// TODO Auto-generated method stub
		return "HolaMundo - Constructor";
	}

}
