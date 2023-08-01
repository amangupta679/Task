package com.amang;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.amang.beans")
public class AppConfig {
	

	@Bean
	@Scope("prototype")
	public Address address()
	{
		return new Address("7-8-9","Sarojni Nagar","Himmat wala", "hydebadh");
	}
	@Bean(initMethod = "initPerson" , destroyMethod = "destPerson")
	public Person person()
	{
		Person p = new Person();
		p.setSsn(101);
		p.setName("aman");
		p.setAge(23);
		return p ; 
		
	}
}
