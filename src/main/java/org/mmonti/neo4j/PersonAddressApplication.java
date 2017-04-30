package org.mmonti.neo4j;

import org.mmonti.neo4j.model.Address;
import org.mmonti.neo4j.model.Person;
import org.mmonti.neo4j.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class PersonAddressApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonAddressApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(PersonRepository personRepository) {
		return (args) -> {
			Person p = new Person(null, "Person", new ArrayList());
			Address a1 = new Address(null, "Address 1");
			Address a2 = new Address(null, "Address 2");
			Address a3 = new Address(null, "Address 3");

			p.add(a1);
			p.add(a2);
			p.add(a3);

			personRepository.save(p);

			Person person = personRepository.findOne(p.getId());
			person.getAddresses().stream().forEach(System.out::println);
			// I am getting a random order on the printed Addresses. Should I get a1, a2 then a3.
		};
	}
}
