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
import mx.com.wiirux.sfgdi.datasource.FakeDataSource;
import mx.com.wiirux.sfgdi.services.PrototypeBean;
import mx.com.wiirux.sfgdi.services.SingletonBean;

//@ComponentScan(basePackages = {"mx.com.wiirux.sfgdi", "com.otro.wiirux.pets.services"})
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
		// el getBean debe ser empezando en minusculas
		MiControlador mc = (MiControlador) ctx.getBean("miControlador");

		// String saludos = mc.decirHola();

		// System.out.println(saludos);
		System.out.println(mc.decirHola());

		System.out.println("----property");

		PropiedadInjectadaControlador pic = (PropiedadInjectadaControlador) ctx
				.getBean("propiedadInjectadaControlador");

		System.out.println(pic.getSaludos());

		System.out.println("----setter");

		SetterInjectadoControlador sic = (SetterInjectadoControlador) ctx.getBean("setterInjectadoControlador");

		System.out.println(sic.getSaludos2());

		System.out.println("----constructor");

		ConstructorInjectadoControlador cic = (ConstructorInjectadoControlador) ctx
				.getBean("constructorInjectadoControlador");

		System.out.println(cic.getSaludos3());

		System.out.println("----- BEAN SCOPES -----");
		SingletonBean sb1 = ctx.getBean(SingletonBean.class);
		System.out.println(sb1.getMyScope());
		SingletonBean sb2 = ctx.getBean(SingletonBean.class);
		System.out.println(sb2.getMyScope());

		PrototypeBean pb1 = ctx.getBean(PrototypeBean.class);
		System.out.println(pb1.getMyScope());
		PrototypeBean pb2 = ctx.getBean(PrototypeBean.class);
		System.out.println(pb2.getMyScope());

		System.out.println("----- PROPERTIES FROM FILE");
		FakeDataSource fds = ctx.getBean(FakeDataSource.class);
		System.out.println(fds.getUsername());
		System.out.println(fds.getPassword());
		System.out.println(fds.getJdbcurl());
	}

}
