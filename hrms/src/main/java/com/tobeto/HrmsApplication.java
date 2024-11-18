package com.tobeto;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import kps.webservice.KPSPublic;

@SpringBootApplication
//@ComponentScan(basePackages = "com.tobeto")
public class HrmsApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(HrmsApplication.class, args);
		//System.out.println(new KPSPublic().getKPSPublicSoap().tcKimlikNoDogrula(111111111111L, "Ömer", "Özgür", 1995));
	}
	
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();	}

}
