package mx.com.wiirux.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {
	public PrototypeBean() {
		System.out.println("Creando un prototype bean!!!!!!!");
	}
	
	public String getMyScope() {
		return "Soy un prototype";
	}
}
