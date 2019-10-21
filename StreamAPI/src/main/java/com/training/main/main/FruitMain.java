package com.training.main.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.training.myapp.model.FruitModel;

public class FruitMain {

	public static void main(String[] args) {
		List<FruitModel> fruits= new ArrayList<>();
		fruits.add(new FruitModel("Apple",15,26,"green"));
		fruits.add(new FruitModel("banana",130,10,"yellow"));
		fruits.add(new FruitModel("orange",100,20,"orange"));
		fruits.add(new FruitModel("mango",200,40,"yellow"));
		fruits.add(new FruitModel("goa",180,1400,"green"));
		fruits.add(new FruitModel("promanganate",300,30,"red"));
		fruits.add(new FruitModel("cherry",130,10,"red"));
		
	 Comparator<FruitModel> compare= (f1, f2) -> {
		int result = Integer.compare(f2.getFruitCalouries(), f1.getFruitCalouries());
		return result;
	};
		Predicate<FruitModel> P = (f) -> f.getFruitPrice() < 100;
					 List<FruitModel> calorieslessthan100 = fruits.stream()
				                                        .filter(P)
			                                        .sorted(compare)
					                                         .collect( Collectors.toList());
					                                        		 
					calorieslessthan100.forEach(f -> System.out.println(f));	
			 


	}

}
