package com.ani.interfaces.functional;

import java.util.function.Supplier;
import java.util.function.Consumer;

public class SupplierConsumer {

	public static void main(String[] args) {
		
		//Consumer is a functional interface provided by Java 8
		Consumer<String> consumer = (String s) -> {
			System.out.println("I am the consumer of string: " + s);
		};
		
		//Supplier is a functional interface provided by Java 8
		Supplier<String> supplier = () -> {
			 return "Animesh";
		};
		
		//Methods of functional interfaces can be called using the declared variable.
		consumer.accept(supplier.get());

	}

}
