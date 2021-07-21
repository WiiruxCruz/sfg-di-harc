package mx.com.wiirux.sfgdi.services.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		if(bean instanceof LifeCycleDemoBean) {
			( (LifeCycleDemoBean) bean).beforeInit();
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		if(bean instanceof LifeCycleDemoBean) {
			( (LifeCycleDemoBean) bean).afterInit();
		}
		return bean;
	}
	
}
