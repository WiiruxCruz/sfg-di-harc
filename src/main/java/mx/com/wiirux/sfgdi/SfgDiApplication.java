package mx.com.wiirux.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import mx.com.wiirux.sfgdi.controllers.ConstructorInjectadoControlador;
import mx.com.wiirux.sfgdi.controllers.MiControlador;
import mx.com.wiirux.sfgdi.controllers.PetController;
import mx.com.wiirux.sfgdi.controllers.PropiedadInjectadaControlador;
import mx.com.wiirux.sfgdi.controllers.SetterInjectadoControlador;
import mx.com.wiirux.sfgdi.controllers.i18nControlador;

@ComponentScan(basePackages = {"mx.com.wiirux.sfgdi", "com.otro.wiirux.pets.services"})
@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		System.out.println("--- The Best Pet is ---");
		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println(petController.whichPetIsTheBest());
		
		System.out.println("----profile active");
		i18nControlador i18nc = (i18nControlador) ctx.getBean("i18nControlador");
		
		System.out.println(i18nc.decirHola());
		
		System.out.println("----primary");
		//el getBean debe ser empezando en minusculas
		MiControlador mc = (MiControlador) ctx.getBean("miControlador");
		
		//String saludos = mc.decirHola();
		
		//System.out.println(saludos);
		System.out.println(mc.decirHola());
		
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
