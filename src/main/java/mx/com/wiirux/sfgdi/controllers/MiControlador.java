package mx.com.wiirux.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MiControlador {
	public String decirHola() {
		System.out.println("Hola mundo!");
		
		return "Hola amigos!";
	}
}
