package com.cursoinfotec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursoInfotecApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoInfotecApplication.class, args);
		ArrayList<Double> numList = new ArrayList<Double>();
		for(int i = 1; i <= 5; i++) {
			numList.add(Math.random() * ((1000 - 1)) + 1);
		}
		Collections.sort(numList);
		System.out.println(numList);
		Comparator<Double> comparator = Collections.reverseOrder();
		Collections.sort(numList, comparator);
		System.out.println(numList);
		
		String[] list1 = {"A", "B", "C", "D", "E"};
		String[] list2 = {"B", "D", "F", "G", "H"};
		
		List<String> listA = new ArrayList<String>(Arrays.asList(list1));
		List<String> listB = new ArrayList<String>(Arrays.asList(list2));
		
		List<String> listFinal = Stream.concat(listA.stream(),listB.stream()).distinct().collect(Collectors.toList());
		
		Collections.sort(listFinal);
		
		System.out.println(listFinal);
	}

}
