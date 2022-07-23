package javaarraysandstring;

public class PalindromicArray {
	
//	Explanation:
//		For First test case.
//		n=5;
//		A[0] = 111    //which is a palindrome number.
//		A[1] = 222   //which is a palindrome number.
//		A[2] = 333   //which is a palindrome number.
//		A[3] = 444  //which is a palindrome number.
//		A[4] = 555  //which is a palindrome number.
//		As all numbers are palindrome so This will return 1.

	public static int palinArray(int[] a, int n)
    {
       boolean palin=false;
           for(int i=0;i<a.length;i++){
               
               int num=a[i];
               int temp=num;
               int rev=0;
               
               while(num>0){
                   rev=rev*10+ num%10;
                   num=num/10;
               }
               if(rev==temp){
                   palin=true;
               }
               else{
            	   palin=false;
                   break;
               }
           }
           
           if(palin==true){
               return 1;
           }else{
               return 0;
           }
    }
	
	public static void main(String[] args) {
		
//		int[] a= {111,222,333,444,555};
		int []a= {121,131,20};
		
		PalindromicArray.palinArray(a, 5);
	}
}
