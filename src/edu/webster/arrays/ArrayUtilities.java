package edu.webster.arrays;

public class ArrayUtilities
{

	public static void main(String[] args)
	{
		int myArray[][] = {{ 1, 2, 3, 4},   // row 0
						   { 5, 6, 7, 8}};  // row 1
	
		System.out.println("Total value of array is: " + getTotalValue(myArray));
		System.out.println("Average of array is:     " + getAverageOfArray(myArray));
		System.out.println("Row total is:            " + getRowTotal(myArray, 1));  // total for row #1
		System.out.println("Column total is:         " + getColumnTotal(myArray, 2));  // total for column #2
		
        System.out.println("\nThe above program was written by: Cadence Seim");
	}

	private static int getTotalValue(int[][] myArray)
	{
		int total=0;	
		for (int row = 0; row < myArray.length; row++)
		{
			for (int col = 0; col < myArray[0].length; col++)
			{
				total = total + myArray[row][col];
			}
		}
		return total;
	}
	
	private static double getAverageOfArray(int[][] myArray)
	{
		int total = 0;
		double average = 0;
		double numElements = myArray.length * myArray[0].length;
		
		
		for (int row = 0; row < myArray.length; row++)
		{
			for (int col = 0; col < myArray[0].length; col++)
			{
				total = total + myArray[row][col];
			}
		}
		
		average = total / numElements;
		
		return average; 
	}
	
	private static int getRowTotal(int[][] myArray, int rowNumber )
	{
		int rowSum = 0;
		
		for(int i = 0; i < myArray[rowNumber].length; i++)
		{
			rowSum += myArray[rowNumber][i];
		}
		
		return rowSum; 
	}
	
	private static int getColumnTotal(int[][] myArray, int columnNumber)
	{
		int columnSum = 0;
		
		for(int i = 0; i < myArray.length; i++)
		{
			columnSum += myArray[i][columnNumber];
		}
		
		return columnSum; 
	}
}
