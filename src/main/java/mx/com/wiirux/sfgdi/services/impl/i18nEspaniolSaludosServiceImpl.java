package mx.com.wiirux.sfgdi.services.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import mx.com.wiirux.sfgdi.services.SaludosService;

@Profile({"ES", "default"})
@Service("i18nService")
public class i18nEspaniolSaludosServiceImpl implements SaludosService {

	@Override
	public String decirSaludos() {
		// TODO Auto-generated method stub
		return "Hola mundo! - ES";
	}

}
