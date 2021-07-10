package com.ani.lambda.composition;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerComposition {

	public static void main(String[] args) {
		
	  List<String> list = new ArrayList<String>(List.of("Apple", "Ball", "Cat", "Dog"));
	  Consumer<String> printFirstLetter = s -> System.out.print(s.charAt(0));
	  Consumer<String> printWholeWord = s -> System.out.println(s);
	  
	  // We are composing a consumer composeLine with the help of two different consumers
	  Consumer<String> composeLine = s -> {
	    printFirstLetter.accept(s);
	    System.out.print(" for ");
	    printWholeWord.accept(s);
	  };
	  
	  list.forEach(composeLine);

	}

}
