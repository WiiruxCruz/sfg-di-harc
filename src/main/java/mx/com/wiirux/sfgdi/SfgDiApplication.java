package mx.com.wiirux.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import mx.com.wiirux.sfgdi.controllers.ConstructorInjectadoControlador;
import mx.com.wiirux.sfgdi.controllers.MiControlador;
import mx.com.wiirux.sfgdi.controllers.PropiedadInjectadaControlador;
import mx.com.wiirux.sfgdi.controllers.SetterInjectadoControlador;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		//el getBean debe ser empezando en minusculas
		MiControlador mc = (MiControlador) ctx.getBean("miControlador");
		
		String saludos = mc.decirHola();
		
		System.out.println(saludos);
		
		System.out.println("----property");
		
		PropiedadInjectadaControlador pic = (PropiedadInjectadaControlador) ctx.getBean("propiedadInjectadaControlador");
		
		System.out.println(pic.getSaludos());
		
		System.out.println("----setter");
		
		SetterInjectadoControlador sic = (SetterInjectadoControlador) ctx.getBean("setterInjectadoControlador");
		
		System.out.println(sic.getSaludos2());
		
		System.out.println("----constructor");
		
		ConstructorInjectadoControlador cic = (ConstructorInjectadoControlador) ctx.getBean("constructorInjectadoControlador");
		
		System.out.println(cic.getSaludos3());
	}

}
