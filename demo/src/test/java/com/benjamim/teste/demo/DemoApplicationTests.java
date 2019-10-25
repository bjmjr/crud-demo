package com.benjamim.teste.demo;

import com.benjamim.teste.demo.dto.ClienteDTO;
import com.benjamim.teste.demo.repository.ClienteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DataJpaTest
class DemoApplicationTests {

	@Autowired
	private TestEntityManager testEntityManager;

	@Autowired
	private ClienteRepository clienteRepository;




}
