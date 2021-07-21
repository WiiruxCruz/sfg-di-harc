/**
 * 
 */
package mx.com.wiirux.sfgdi.services.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author wii64
 *
 */
public class LifeCycleDemoBean
		implements InitializingBean, DisposableBean, BeanNameAware,
		BeanFactoryAware, ApplicationContextAware {
	
	public LifeCycleDemoBean() {
		// TODO Auto-generated method stub
		System.out.println("Impresion en el constructor");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Application Context ha sido establecido");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("El bean Factory ha sido establecido");
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("El nombre de mi bean es:" + name);
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("el ciclo de vida del bean ha terminado");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("El ciclo de vida del bean ha sido establecido por completo");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("La anotación del postConstructor method ha sido invocada");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("La anotación del preDestroy method ha sido invocada");
	}
	
	public void beforeInit() {
		System.out.println("Before init - Called by Bean Post Processor");
	}
	
	public void afterInit() {
		System.out.println("After init - Called by Bean Post Processor");
	}
}
