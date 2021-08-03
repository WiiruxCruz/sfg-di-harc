package mx.com.wiirux.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import mx.com.wiirux.sfgdi.services.impl.ConstructorSaludosServiceImpl;
import mx.com.wiirux.sfgdi.services.impl.PrimarioSaludosServiceImpl;
import mx.com.wiirux.sfgdi.services.impl.PropiedadSaludosServiceImpl;
import mx.com.wiirux.sfgdi.services.impl.SetterSaludosServiceImpl;
import mx.com.wiirux.sfgdi.services.impl.i18nEspaniolSaludosServiceImpl;
import mx.com.wiirux.sfgdi.services.impl.i18nInglesSaludosServiceImpl;

@Configuration
public class SaludosServiceConfig {
	
	@Profile({"ES", "default"})
	@Bean("i18nService")
	i18nEspaniolSaludosServiceImpl i18nEspaniolSaludosServiceImpl() {
		return new i18nEspaniolSaludosServiceImpl();
	}
	
	@Profile("EN")
	@Bean
	i18nInglesSaludosServiceImpl i18nService() {
		return new i18nInglesSaludosServiceImpl();
	}
	
	@Primary
	@Bean
	PrimarioSaludosServiceImpl primarioSaludosServiceImpl() {
		return new PrimarioSaludosServiceImpl();
	}
	
	@Bean
	ConstructorSaludosServiceImpl constructorSaludosServiceImpl() {
		return new ConstructorSaludosServiceImpl();
	}
	
	@Bean
	PropiedadSaludosServiceImpl propiedadSaludosServiceImpl() {
		return new PropiedadSaludosServiceImpl();
	}
	
	@Bean
	SetterSaludosServiceImpl setterSaludosServiceImpl() {
		return new SetterSaludosServiceImpl();
	}
}
