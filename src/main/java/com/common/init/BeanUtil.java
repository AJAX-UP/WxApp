package com.common.init;

import org.springframework.stereotype.Service;
import org.springframework.web.context.support.WebApplicationObjectSupport;

@Service
public class BeanUtil extends WebApplicationObjectSupport{

	public Object getBeanByName(String name) {
		
		return super.getApplicationContext().getBean(name);
	}
	
}
