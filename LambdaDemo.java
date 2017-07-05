package com.learning.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class LambdaDemo 
{

	public static void main(String[] args) 
	{
		
		List<Person> personList = (List) Arrays.asList(
				 new Person(15,"Venkatesh","Sathiri","negotiable"), new Person(17,"Raj","Kumar","negotiable"),
				 new Person(16,"Puri","Jagannadh","negotiable"), new Person(18,"Giri","Prasad","negotiable"));
		 
		       System.out.println("------Before sort by name------");
		       
		       printAll(personList);
		       
		       System.out.println("----------");
		       
		       Collections.sort(personList,
		    		   (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
		    
		       System.out.println("----After sort by name------");
		       printAll(personList);
		       System.out.println("---------------------------------");
		}

	private static void printAll(List<Person> personList) 
	{
		for (Person person : personList)
		{
			System.out.println(person);
		}
	}
}
		
		
	