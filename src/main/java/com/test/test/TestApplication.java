package com.test.test;

import com.test.test.Model.*;
import com.test.test.Repository.ClientRepository;
import com.test.test.Repository.CompteRepository;
import com.test.test.Repository.OperationRepository;
import com.test.test.Service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class TestApplication {
	/*@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private OperationRepository operationRepository;*/

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

	/*public void run(String... arg0) throws Exception {
		ClientModel c1 = clientRepository.save(new ClientModel("Hassan", "hassan@gmail.com","hassan","cp1"))	;
		ClientModel c2 = clientRepository.save(new ClientModel("Rachid", "rachid@gmail.com","hassan","cp2"))	;
		ClientModel c3 = clientRepository.save(new ClientModel("Jaiti Mohammed", "jaitimohammed@yahoo.com","hassan","D0192C11199C2005"));
//
		CompteModel cp1 = compteRepository.save(new CompteModel(90000,c1));
		CompteModel cp2 = compteRepository.save(new CompteModel(6000,c2));
		CompteModel D0192C11199C2005=compteRepository.save(new CompteModel(10000,c3));
//
		operationRepository.save(new VersementModel(new Date(),9000 , cp1) );
		operationRepository.save(new VersementModel(new Date(),6000 , cp1) );
		operationRepository.save(new VersementModel(new Date(),230 , cp1) );
		operationRepository.save(new RetraitModel(new Date(),9000 , cp1) );
//
		operationRepository.save(new VersementModel(new Date(),2300 , cp2) );
		operationRepository.save(new VersementModel(new Date(),400 , cp2) );
		operationRepository.save(new VersementModel(new Date(),2300 , cp2) );
		operationRepository.save(new RetraitModel(new Date(),3000 , cp2) );
//
		operationRepository.save(new VersementModel(new Date(),8500 , D0192C11199C2005) );
		operationRepository.save(new VersementModel(new Date(),6070 , D0192C11199C2005) );
		operationRepository.save(new VersementModel(new Date(),2400 , D0192C11199C2005) );
		operationRepository.save(new RetraitModel(new Date(),1000 , D0192C11199C2005) );
//
		operationRepository.verser("cp1", 111111);
		operationRepository.verser("D0192C11199C2005",2050);
	}*/

}
