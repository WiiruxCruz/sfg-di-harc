package mx.com.wiirux.sfgdi.services.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import mx.com.wiirux.sfgdi.services.SaludosService;

@Primary
@Service
public class PrimarioSaludosServiceImpl implements SaludosService {

	@Override
	public String decirSaludos() {
		// TODO Auto-generated method stub
		return "Hola mundo - PRIMARIO";
	}

}
