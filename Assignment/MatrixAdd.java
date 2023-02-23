package com.practical;

public class MatrixAdd {

	public static void main(String[] args) {
		//two matrices
		int num1[][]= {{9,8,7},{1,2,3},{4,5,5}};
		int num2[][]= {{9,8,7},{1,2,3},{4,5,5}};
		
		//result matrix to store sum
		
		int res[][]=new int[3][3];
		//add
		/* for(int i=0;i<3;i++) {
			 for(int j=0;j<3;j++) {
				 res[i][j]=num1[i][j]+num2[i][j];
				System.out.print(res[i][j]+ " ");
				
		
			 }*/
			 //sub
			 for(int i=0;i<3;i++) {
				 for(int j=0;j<3;j++) {
					 res[i][j]=num1[i][j]-num2[i][j];
					System.out.print(res[i][j]+ " ");
					
			
				 }
			 System.out.println();
			 
			 
			 
			 
			 
		 }
		
		
		
		

}
}
