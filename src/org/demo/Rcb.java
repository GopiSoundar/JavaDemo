package org.demo;

public class Rcb {
	
	public static void main(String[] args) {
		
		for (int i = 0; i <=5; i++) {
			
			System.out.println();
			
			for (int j =5; j >=i; j--) {
				
				System.out.print ("* ");
				
				for (int j2 = 6; j2 <=10; j2++) {
					
					System.out.println(" ");
					
					for (int k = 10; k >=j2; k--) {
						
						System.out.print ("* ");
						
					}
					
					
				}
				
			}
			
		}
	}

}
