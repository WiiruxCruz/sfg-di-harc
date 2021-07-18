package mx.com.wiirux.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import mx.com.wiirux.sfgdi.controllers.MiControlador;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		MiControlador mc = (MiControlador) ctx.getBean("miControlador");
		
		String saludos = mc.decirHola();
		
		System.out.println(saludos);
	}

}
