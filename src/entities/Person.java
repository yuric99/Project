package entities;

import java.util.List;

public class Person {

	private String name, cpf, sexo;
	private Short age;

	public Person() {

	}

	public Person(String name, String cpf, String sexo, Short age) {
		this.name = name;
		this.cpf = cpf;
		this.sexo = sexo;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getCpf() {
		return cpf;

	}

	public void setCpf(String cpf) {
		this.cpf = cpf;

	}

	public String getSexo() {
		return sexo;

	}

	public void setSexo(String sexo) {
		this.sexo = sexo;

	}

	public short getAge() {
		return age;

	}

	public void setAge(Short age) {
		this.age = age;

	}

	public static short verifyAge(Short age) {

		if (age >= 18) {
			return 1;

		} else {
			return 0;
		}

	}

	public static int validSex(String sexo) {
		if (sexo.equals("Male") || sexo.equals("male") || sexo.equals("Female") || sexo.equals("female")) {
			return 0;
		} else {
			return 1;
		}

	}

	public static String verifySex(String sexo) {

		if (sexo.charAt(0) == 'M' || sexo.charAt(0) == 'm') {
			return "1";
		}

		else {
			return "0";
		}

	}

	public static boolean hasCpf(List<Person> list, String cpf) {
		Person person = list.stream().filter(x -> x.getCpf().equals(cpf)).findFirst().orElse(null);
		return person != null;

	}

	public static boolean hasName(List<Person> list, String name) {
		Person person = list.stream().filter(x -> x.getName().equals(name)).findFirst().orElse(null);
		return person != null;

	}

	public String toString() {
		return "Name: " + name + "\n" 
				+ "CPF: " + cpf + "\n" 
				+ "Sexo: " + sexo + "\n" 
				+ "Age: " + age + " years old.\n";

	}

}
