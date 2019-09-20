package com.axone.devintest.arrays;

public class MultiArray {

	public static void main(String[] args) {
	
		String[][] multiArr = new String[3][4];//rows first, cols second
		multiArr[0][0] = "Ram";
		multiArr[0][1] = "Wokingham";
		
		String[][] empDetails = {
				{"Ram", "Wokingham", "RG41", "male"},
				{"Tom", "Woking", "XX32", "male"},
				{"Sarah", "London", "W1", "female"}
		};
		
		System.out.println(empDetails[1][1]);
		
		int rows = empDetails.length; //variable name.length of a 2d array will always print the number of rows
		System.out.println(rows);
		
		String[] row1 = empDetails[0];
		
		//print the values in row1 retrieved from the 2d array
		/*for (int i=0; i < row1.length; i++){
			System.out.println(row1[i]);
		}*/
		
		//String[] row2 = empDetails[1];
		//String[] row3 = empDetails[2];
		
		int cols = row1.length;

		for(int i=0; i < rows; i++){
			for(int j=0; j < cols; j++){
				System.out.println(empDetails[i][j]);
			}
		}
		
	}

}
