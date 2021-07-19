/**
 * 
 */
package mx.com.wiirux.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mx.com.wiirux.sfgdi.services.impl.ConstructorSaludosServiceImpl;

/**
 * @author wii64
 *
 */
class SetterInjectadoControladorTest {
	
	SetterInjectadoControlador controlador;

	/**
	 * @throws java.lang.Exception
	 */
	/*
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	*/
	
	@BeforeEach
	void setUp() {
		controlador = new SetterInjectadoControlador();
		controlador.setSaludosService(new ConstructorSaludosServiceImpl());
	}

	/**
	 * Test method for {@link mx.com.wiirux.sfgdi.controllers.SetterInjectadoControlador#getSaludos2()}.
	 */
	@Test
	void testGetSaludos2() {
		System.out.println(controlador.getSaludos2());
	}

}
