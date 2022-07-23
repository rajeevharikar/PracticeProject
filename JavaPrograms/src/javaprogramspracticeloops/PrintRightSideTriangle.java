package javaprogramspracticeloops;

public class PrintRightSideTriangle {
	
	/*     1 first we need to print the space which is 4,then 3,2,1,0
	 *    22
	 *   333
	 *  4444
	 * 55555  
	 */
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			
			for(int s=1; s<=5-i;s++) {
				
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(i);
			}
			
			System.out.println();
		}
	}

}
