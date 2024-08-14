import java.util.*;
import java.lang.*;
import java.io.*;

class MaxElemnet
{
	public static void main (String[] args) {
		
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        
        for(int t = 0; t < N; t++) {
            int Mountain = s.nextInt(); 
        int[] arr = new int[Mountain];
        
        for(int i = 0; i < Mountain; i++) {
                arr[i] = s.nextInt(); 
            }
            
        int max = arr[0];
        
        for(int i=1;i<arr.length;i++){
          if(arr[i]>max){
            max=arr[i];
          }
        }
         System.out.print(max);
        }
        s.close();
	}
}
