package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MySum {

	public static void main(String[] args) {
		
		int[] inputArray = new int[] {2,5,2,5,2,4,6,7,9};
		
		System.out.println("Enter the target number");
		Scanner sc = new Scanner(System.in);
		
		int target = sc.nextInt();
		
		Map<Integer, Integer> output = findNumberCombo (inputArray, target);
		
		for(Map.Entry<Integer, Integer> myMap : output.entrySet())
		{
			System.out.println("Set of indices are " + myMap.getKey() +"," +myMap.getValue());
		}
	}

	private static Map findNumberCombo(int[] inputArray, int target) {
		
		Map<Integer, Integer> tempMap = new HashMap<Integer, Integer>();
		
		Map<Integer, Integer> outputMap = new HashMap<Integer, Integer>();
		
		for (int i=0 ; i<inputArray.length; i++)
		{
			int comp = target - inputArray[i];
			
			tempMap.put(inputArray[i], i);
			
			if (tempMap.containsKey(comp))
			{
				outputMap.put(tempMap.get(comp), i);
			}
			
			
		}
		return outputMap;
		
		
	}
	
	

}
