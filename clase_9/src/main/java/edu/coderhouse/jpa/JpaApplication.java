package edu.coderhouse.jpa;

import edu.coderhouse.jpa.entity.Address;
import edu.coderhouse.jpa.entity.Client;
import edu.coderhouse.jpa.service.DaoFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

	@Autowired
	public DaoFactory daoFactory;

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			// Se crea un cliente
			Client cliente = new Client("Juan", "Perez", 12345678);

			// Se crea los domicilios
			Address domicilioParticular = new Address("Calle 1", 123);
			Address domicilioLaboral = new Address("Calle 2", 456);

			domicilioParticular.setClient(cliente);
			domicilioLaboral.setClient(cliente);

			List<Address> domicilios = new ArrayList<Address>();
			domicilios.add(domicilioParticular);
			domicilios.add(domicilioLaboral);

			cliente.setAddresses(domicilios);

			// Crear cliente con domicilios
			daoFactory.create(cliente);

			// Buscar cliente guardado
			Client clienteGuardado = daoFactory.getClient(cliente);

			System.out.println(clienteGuardado.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
