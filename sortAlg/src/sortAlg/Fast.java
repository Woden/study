package sortAlg;

import java.util.Arrays;

public class Fast {
	public  static int[] sort(int[] array){
		
		//1,2,3,4,5,7,6
		int[]out=array;
		int left,right;
		left=0;
		right=out.length-1;
		for (int i = 0; i < out.length; i++) {
			
			if(left>=right){
				
				int tmp=out[right];
				out[right]=out[0];
				out[0]=tmp;
				break;
			}
			
			if(out[right]>=out[0]){
				right--;
			}
			if(out[right]<out[0]){
				for(int j=left;j<right;j++){
					if(out[left]<=out[0]){
						left++;
				   }else{
					   int tmp=out[left];
						out[left]=out[right];
						out[right]=tmp;
				   }
				}
			}
			
				
			
				
			
		}
	
		
		if(0<right-1){
		int[] leftOut=sort(Arrays.copyOfRange(out,0,right));
		for (int i = 0; i < leftOut.length; i++) {
			out[i]=leftOut[i];
			
		}
		System.out.println("left:");
		for (int k = 0; k < out.length; k++) {
			 System.out.print(out[k]+",");
		   }
		System.out.println();
		}
		if(right+1<out.length-1){
		int[] rightOut=sort(Arrays.copyOfRange(out,right+1,out.length));
		for (int i = 0; i < rightOut.length; i++) {
			out[right+1+i]=rightOut[i];
			
		}
		System.out.println("right:");
		for (int k = 0; k < out.length; k++) {
			 System.out.print(out[k]+",");
		   }
		System.out.println();
		}
		for (int k = 0; k < out.length; k++) {
			 System.out.print(out[k]+",");
		   }
		System.out.println();
		return out;
	}
	
	
	public static void main(String[] args) {
		int[] p=sort(new int[]{1,2,3,4,5,7,6});
		System.out.print("final:");
       for (int i = 0; i < p.length; i++) {
		 System.out.print(p[i]+",");
	   }
		
//		int a[] = {2, 3, 4, 5, 6, 7, 8, 9};
//	       int from = 0;
//	       int to = 2;
//	       int original[] = Arrays.copyOfRange(a, from, to);
//	       for (int c : original) {
//	           System.out.println(c);
//	       }

	}

}
