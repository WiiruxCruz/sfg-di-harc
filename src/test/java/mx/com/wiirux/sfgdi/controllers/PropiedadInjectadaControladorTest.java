package mx.com.wiirux.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mx.com.wiirux.sfgdi.services.impl.ConstructorSaludosServiceImpl;

class PropiedadInjectadaControladorTest {
	
	PropiedadInjectadaControlador controlador;
	
	@BeforeEach
	void setUp() {
		controlador = new PropiedadInjectadaControlador();
		controlador.ss = new ConstructorSaludosServiceImpl();
	}
	
	
	@Test
	void testGetSaludos() {
		System.out.println(controlador.getSaludos());
	}

}
