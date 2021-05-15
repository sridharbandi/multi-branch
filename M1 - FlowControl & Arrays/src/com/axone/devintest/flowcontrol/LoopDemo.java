package com.axone.devintest.flowcontrol;

public class LoopDemo {

	//calculate the sum of the first n numbers
	// sum =  1+ 2+ 3+ 4+ ..... n
	
	/**
	 * This method uses the do-while loop
	 * @param - first n numbers to be added
	 * @return - sum of the first n numbers
	 */
	public int useDoWhile(int n){
		int sum = 0;
		int count = 0;
		//loop starts here
		do{
			sum = sum + count;
			count++;
		}while(count <= n);
		//loop ends
		return sum;
	}
	
	/**
	 * This method uses the while loop
	 * @param - first n numbers to be added
	 * @return - sum of the first n numbers
	 */
	public int useWhile(int n){
		int sum = 0;
		int count = 0;
		while(count <= n){
			sum = sum + count;
			count ++;
		}
		return sum;
	}
	
	/**
	 * This method uses the for loop
	 * @param - first n numbers to be added
	 * @return - sum of the first n numbers
	 */
	public int useFor(int n){
		int sum =0;
		
		for(int count=0; count <= n; count ++){
			sum = sum + count;
		}
		
		return sum;
	}

	public int useFor1(int n){
		int sum =0;

		for(int count=0; count <= n; count ++){
			sum = sum + count;
		}

		return sum;
	}


	public static void main(String[] hei) {
		LoopDemo lDemo = new LoopDemo();
		int sum = lDemo.useDoWhile(4);
		//int sum = lDemo.useWhile(4);
		//int sum = lDemo.useFor(4);
		System.out.println(sum);
		System.out.println(sum);
	}

}
