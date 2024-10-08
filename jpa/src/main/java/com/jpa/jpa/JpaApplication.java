package com.jpa.jpa;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.jpa.entities.Person;
import com.jpa.jpa.respositories.PersonRepositoty;



@SpringBootApplication
public class JpaApplication implements CommandLineRunner{

	@Autowired // Traigo el personRepository y lo injecto como dependencia
	private PersonRepositoty personRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}


	// Cuando se ejecute el servidor ejecute todos los comandos desde la consola

	@Override
	public void run(String... args) throws Exception {
		//create(); // llamo a la funcion create

		// LLAMO AL METODO QUE ESTA EN LA INTERFAZ PERSONREPOSITORY
		// List<Person> persons = (List<Person>) personRepositoty.findByProgrammingLanguage("Java");
		// persons.stream().forEach(person -> System.out.println(person));

		// 
		// List<Person> persons = (List<Person>) personRepositoty.buscarByProgrammingLanguage("Java" , "Daniel");
		// persons.stream().forEach(person -> System.out.println(person));
		
	}

/* 	@Transactional
	public void create() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el nombre:");
		String name = scanner.next();
		System.out.println("Ingrese el apellido:");
		String lastname = scanner.next();
		System.out.println("Ingrese el lenguaje de programacion:");
		String programmingLanguage = scanner.next();
		scanner.close();

		Person person = new Person(null, name, lastname, programmingLanguage);

		Person personNew = personRepository.save(person);
		System.out.println(personNew);

		personRepository.findById(personNew.getId()).ifPresent(System.out::println);

	}
	@Transactional
	public void update() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el id de la persona:");
		Long id = scanner.nextLong();

		Optional<Person> optionalPerson = personRepository.findById(id);

		// optionalPerson.ifPresent(person -> {
		if (optionalPerson.isPresent()) {
			Person personDB = optionalPerson.orElseThrow();	

			System.out.println(personDB);
			System.out.println("Ingrese el lenguaje de programacion:");
			String programmingLanguage = scanner.next();
			personDB.setProgrammingLanguage(programmingLanguage);
			Person personUpdated = personRepository.save(personDB);
			System.out.println(personUpdated);
		} else {
			System.out.println("El usuario no esta presente! no existe!");
		}

		scanner.close();
	}

	@Transactional(readOnly = true)
	public void queriesFunctionAggregation() {

		
		System.out.println("================== consulta con el total de registros de la tabla persona ==================");
		Long count = personRepository.getTotalPerson();
		System.out.println(count);
		
		System.out.println("================== consulta con el valor minimo del id ==================");
		Long min = personRepository.getMinId();
		System.out.println(min);
		
		System.out.println("================== consulta con el valor maximo del id");
		Long max = personRepository.getMaxId();
		System.out.println(max);
		
		System.out.println("================== consulta con el nombre y su largo ==================");
		List<Object[]> regs = personRepository.getPersonNameLength();
		regs.forEach(reg -> {
			String name = (String) reg[0];
			Integer length = (Integer) reg[1];
			System.out.println("name=" + name + ", length=" + length);
		});
		
		System.out.println("================== consulta con el nombre mas corto ==================");
		Integer minLengthName = personRepository.getMinLengthName();
		System.out.println(minLengthName);
		
		System.out.println("================== consulta con el nombre mas largo ==================");
		Integer maxLengthName = personRepository.getMaxLengthName();
		System.out.println(maxLengthName);

		System.out.println("================== consultas resumen de funciones de agregacion min, max, sum, avg, count ==================");
		Object[] resumeReg = (Object[]) personRepository.getResumeAggregationFunction();
		System.out.println(
			    "min=" + resumeReg[0] +
				", max=" + resumeReg[1] +
				", sum=" + resumeReg[2] +
				", avg=" + resumeReg[3] +
		        ", count=" + resumeReg[4]);
	}

	@Transactional(readOnly=true)
	public void personalizedQueriesBetween() {
		System.out.println("================== consultas por rangos ==================");
		List<Person> persons = personRepository.findByIdBetweenOrderByNameAsc(2L, 5L);
		persons.forEach(System.out::println);
		
		persons = personRepository.findByNameBetweenOrderByNameDescLastnameDesc("J", "Q");
		persons.forEach(System.out::println);

		persons = personRepository.findAllByOrderByNameAscLastnameDesc();
		persons.forEach(System.out::println);
	}

	@Transactional(readOnly = true)
	public void personalizedQueriesConcatUpperAndLowerCase() {
		System.out.println("================== consulta nombres y apellidos de personas ==================");
		List<String> names = personRepository.findAllFullNameConcat();
		names.forEach(System.out::println);

		System.out.println("================== consulta nombres y apellidos mayuscula ==================");
		names = personRepository.findAllFullNameConcatUpper();
		names.forEach(System.out::println);

		System.out.println("================== consulta nombres y apellidos minuscula ==================");
		names = personRepository.findAllFullNameConcatLower();
		names.forEach(System.out::println);
		System.out.println("================== consulta personalizada persona upper y lower case ==================");
		List<Object[]> regs = personRepository.findAllPersonDataListCase();
		regs.forEach(reg -> System.out.println("id="+ reg[0] + ", nombre=" + reg[1] + ", apellido=" + reg[2]+ ", lenguaje="+reg[3]));

	}

	@Transactional(readOnly = true)
	public void personalizedQueriesDistinct() {
		System.out.println("================== consultas con nombres de personas ==================");
		List<String> names = personRepository.findAllNames();
		names.forEach(System.out::println);

		System.out.println("==================  consultas con nombres unicos de personas ==================");
		names = personRepository.findAllNamesDistinct();
		names.forEach(System.out::println);

		System.out.println("================== consulta con lenguaje de programacion unicas ==================");
		List<String> languages = personRepository.findAllProgrammingLanguageDistinct();
		languages.forEach(System.out::println);

		System.out.println("================== consulta con total de lenguajes de programacion unicas ==================");
		Long totalLanguage = personRepository.findAllProgrammingLanguageDistinctCount();
		System.out.println("total de lenguajes de programacion: " + totalLanguage);

	}
	
 */



}
