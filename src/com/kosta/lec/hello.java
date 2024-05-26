package com.kosta.lec;

public class hello {

	public static void main(String[] args) {
		for(int dan=2; dan<=6; dan+=2) {
			System.out.print("★" +dan+"단"+"\t" );
		}
		System.out.println();
		
		for(int gob=2; gob<=8; gob+=2) {
			for(int dan=2; dan<=6; dan+=2) {
				System.out.print(dan+"*"+gob+"=" + (dan*gob)   +"\t" );
			}
			System.out.println();
		}

	}

}
