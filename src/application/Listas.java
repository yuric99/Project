package application;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class Listas {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Bob");
		list.add("John");
		list.add("Jonathan");
		list.add("Marcus");
		list.add("Jane");

		for (String x : list) {
			System.out.println(x);
		}

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());

		System.out.println("---------------------------------------------------");
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("---------------------------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse("Non ecziste");
		System.out.println(name);
	}

}
