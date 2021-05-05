package me.brunosantana.java8_streams_collectors.example10;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Person {

	private String name;
	private LocalDate birthDate;

	public Person(String name, LocalDate birthDate) {
		super();
		this.name = name;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthDate=" + birthDate + "]";
	}

}

public class ReduceExample {

	public static void main(String[] args) {
		Optional<Person> o = getOlderPerson(Arrays.asList("Douglas", "Bruno", "Jeremias", "Jacó"));
		System.out.println();
		System.out.println(o.get());
		
		System.out.println();
		
		Optional<Person> o2 = getOlderPerson2(Arrays.asList("Moisés", "Davi", "João", "Marcos"));
		System.out.println();
		System.out.println(o2.get());
	}

	private static Optional<Person> getOlderPerson(List<String> pessoas) {
		List<Person> map = pessoas.stream().map((p) -> {
			int random = (int) Math.floor(Math.random() * (90 - 10 + 1) + 10);
			return new Person(p, LocalDate.now().minusYears(random));
		}).collect(Collectors.toList());

		System.out.println(map);

		return map.stream().reduce((a, b) -> {
			if (a.getBirthDate().isBefore(b.getBirthDate())) {
				return a;
			}
			return b;
		});
	}

	private static Optional<Person> getOlderPerson2(List<String> pessoas) {
		return pessoas.stream().map((p) -> {
			int random = (int) Math.floor(Math.random() * (90 - 10 + 1) + 10);
			Person person = new Person(p, LocalDate.now().minusYears(random));
			System.out.println(person);
			return person;
		}).reduce((a, b) -> {
			if (a.getBirthDate().isBefore(b.getBirthDate())) {
				return a;
			}
			return b;
		});
	}

}
