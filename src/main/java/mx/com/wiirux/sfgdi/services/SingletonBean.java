package mx.com.wiirux.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
	
	public SingletonBean() {
		System.out.println("Creando un Singleton Bean!");
	}
	
	public String getMyScope() {
		return "Soy un Singleton";
	}
}
