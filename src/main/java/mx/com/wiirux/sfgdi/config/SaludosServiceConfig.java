package mx.com.wiirux.sfgdi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.otro.wiirux.pets.services.PetService;
import com.otro.wiirux.pets.services.PetServiceFactory;

import mx.com.wiirux.sfgdi.datasource.FakeDataSource;
import mx.com.wiirux.sfgdi.repositories.SaludoInglesRepository;
import mx.com.wiirux.sfgdi.repositories.impl.SaludoInglesRepositoryImpl;
import mx.com.wiirux.sfgdi.services.impl.ConstructorSaludosServiceImpl;
import mx.com.wiirux.sfgdi.services.impl.PrimarioSaludosServiceImpl;
import mx.com.wiirux.sfgdi.services.impl.PropiedadSaludosServiceImpl;
import mx.com.wiirux.sfgdi.services.impl.SetterSaludosServiceImpl;
import mx.com.wiirux.sfgdi.services.impl.i18nEspaniolSaludosServiceImpl;
import mx.com.wiirux.sfgdi.services.impl.i18nInglesSaludosServiceImpl;

@EnableConfigurationProperties(SfgConstructorConfig.class)
@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class SaludosServiceConfig {
	
	@Bean
	FakeDataSource fakeDataSource(
			SfgConfiguration sfgc
	) {
		FakeDataSource fds = new FakeDataSource();
		fds.setUsername(sfgc.getUsername());
		fds.setPassword(sfgc.getPassword());
		fds.setJdbcurl(sfgc.getJdbcurl() + "HARC");
		
		return fds;
	}
	
	@Bean
	PetServiceFactory petServiceFactory() {
		return new PetServiceFactory();
	}
	
	@Profile({"dog", "default"})
	@Bean
	PetService dogPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getPetService("dog");
	}
	
	@Profile("cat")
	@Bean
	PetService catPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getPetService("cat");
	}
	
	@Profile({"ES", "default"})
	@Bean("i18nService")
	i18nEspaniolSaludosServiceImpl i18nEspaniolSaludosServiceImpl() {
		return new i18nEspaniolSaludosServiceImpl();
	}
	
	@Bean
	SaludoInglesRepository saludoInglesRespository() {
		return new SaludoInglesRepositoryImpl();
	}
	
	@Profile("EN")
	@Bean
	i18nInglesSaludosServiceImpl i18nService(SaludoInglesRepository sir) {
		return new i18nInglesSaludosServiceImpl(sir);
	}
	
	@Primary
	@Bean
	PrimarioSaludosServiceImpl primarioSaludosServiceImpl() {
		return new PrimarioSaludosServiceImpl();
	}
	
	//@Bean
	/*
	ConstructorSaludosServiceImpl constructorSaludosServiceImpl() {
		return new ConstructorSaludosServiceImpl();
	}
	*/
	
	@Bean
	PropiedadSaludosServiceImpl propiedadSaludosServiceImpl() {
		return new PropiedadSaludosServiceImpl();
	}
	
	@Bean
	SetterSaludosServiceImpl setterSaludosServiceImpl() {
		return new SetterSaludosServiceImpl();
	}
}
