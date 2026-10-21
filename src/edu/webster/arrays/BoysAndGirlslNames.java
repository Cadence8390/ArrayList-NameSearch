package edu.webster.arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BoysAndGirlslNames
{
	public static void main(String[] args) throws FileNotFoundException
	{
		ArrayList<String> boys = getNames("src//edu//webster//arrays//BoyNames.txt");
		ArrayList<String> girls = getNames("src//edu//webster//arrays//GirlNames.txt");

		System.out.println("Boys List size is: " + boys.size());
		System.out.println("Girls List size is: " + girls.size());
		System.out.println();
		
		String nameToFind = "Adam";
		System.out.println("Is " + nameToFind + " found in boys? " + isNameFound(nameToFind, boys));
		nameToFind = "Abby";
		System.out.println("Is " + nameToFind + " found in girls? " + isNameFound(nameToFind, girls));
		nameToFind = "Steve";
		System.out.println("Is " + nameToFind + " found in boys? " + isNameFound(nameToFind, boys));
		nameToFind = "Cindy";
		System.out.println("Is " + nameToFind + " found in girls? " + isNameFound(nameToFind, girls));
		System.out.println();
		
		nameToFind = "Bart";
		System.out.println("Is " + nameToFind + " found in both boys & girls? "
				+ (isNameFound(nameToFind, boys) && (isNameFound(nameToFind, girls))));
		nameToFind = "Jordan";
		System.out.println("Is " + nameToFind + " found in both boys & girls? "
				+ (isNameFound(nameToFind, boys) && (isNameFound(nameToFind, girls)))); 
		System.out.println();
		
		printAllNamesFoundInBothLists(boys, girls);
		
        System.out.println("\nThe above program was written by: Cadence Seim");
	}

	private static void printAllNamesFoundInBothLists(ArrayList<String> boys, ArrayList<String> girls)
	{
		System.out.println("Names Found In Both Lists: ");
		
		for(int i = 0; i < girls.size(); i++)
		{
			for(int x = 0; x < boys.size(); x++)
			{
				if(girls.get(i).equals(boys.get(x)))
				{
					System.out.println(girls.get(i));
				}
			} 
		} 
	}

	private static boolean isNameFound(String nameToFind, ArrayList<String> myListOfNames)
	{
		boolean found = false;
		
		for(int i = 0; i < myListOfNames.size(); i++) 
		{
			if(nameToFind.equals(myListOfNames.get(i)))
			{
				found = true; 
			}
		}
		
		return found; 
	}

	private static ArrayList<String> getNames(String fileToRead) throws FileNotFoundException
	{
		ArrayList<String> names = new ArrayList<String>();

		File myFile = new File(fileToRead);

		Scanner myFileReader = new Scanner(myFile);
		while (myFileReader.hasNextLine()) 
		{
			String aName = myFileReader.nextLine();
			names.add(aName); 
		}

		myFileReader.close(); 
		return names;
	} 

}
