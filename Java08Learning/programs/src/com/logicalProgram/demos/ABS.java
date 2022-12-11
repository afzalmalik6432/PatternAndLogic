package com.logicalProgram.demos;

public class ABS{

	public static void main(String...a){

		final String pig="length: 10";

		final String dog="length: "+pig.length();

		final String dog1="length: "+"10";

		System.out.println(pig==dog);

		System.out.println(pig==dog1);

	}
}
