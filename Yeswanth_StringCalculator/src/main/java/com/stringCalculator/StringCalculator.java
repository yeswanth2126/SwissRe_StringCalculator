package com.stringCalculator;

import java.util.Scanner;

public class StringCalculator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isTerimalReq = false;
		while(!isTerimalReq) {
			System.out.print("Input: ");
			String given = sc.nextLine();
			if(null == given || given.trim().length() == 0) {
				System.out.println(0);
			} else if(given.startsWith("exit")) {
				isTerimalReq = true;
			}else {
				try {
					Long temp = StringCalculator.addNumbers(given);
					System.out.println("Output: "+temp);
				}catch(NumberFormatException nfe) {
					System.out.println("Please provide decimal input");
				} catch(Exception e) {
					System.out.println("Something went wrong, try again");
				}
			}	
		}
		sc.close();
	}
		
	public static long addNumbers(String given) throws NumberFormatException{
		
		if(null == given || given.trim().length() == 0) {
			return 0;
		}
		long output = 0;
		String[] split= given.split("[\\s.,;]+");
		for(String temp: split) {
			long val = Long.parseLong(temp);
			if(!(val<0 || val > 100)) {
				output += val;
			}
		}
		return output;
	}
}