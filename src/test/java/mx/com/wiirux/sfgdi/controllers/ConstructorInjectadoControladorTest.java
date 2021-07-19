package mx.com.wiirux.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mx.com.wiirux.sfgdi.services.impl.ConstructorSaludosServiceImpl;

class ConstructorInjectadoControladorTest {
	
	ConstructorInjectadoControlador controlador;
	
	@BeforeEach
	void setUp() throws Exception {
		controlador = new ConstructorInjectadoControlador( new ConstructorSaludosServiceImpl() );
	}

	@Test
	void testGetSaludos3() {
		System.out.println(controlador.getSaludos3());
	}

}
