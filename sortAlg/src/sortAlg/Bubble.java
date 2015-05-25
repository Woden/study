package sortAlg;


public class Bubble {
	public  static int[] sort(int[] array){
		int[]out=array;
		for (int i = 0; i < out.length-1; i++) {
			System.out.print("round"+i+":");
			for (int j = 0; j < out.length-i-1; j++) {//每次把乱序中最大的值放到最后
				int tmp;
				if(out[j]>out[j+1]){
					tmp=out[j];
					out[j]=out[j+1];
					out[j+1]=tmp;
				}
				
			}
			for (int k = 0; k < out.length; k++) {
				 System.out.print(out[k]+",");
			   }
			System.out.println();
		}
		return out;
	}
	
	public static void main(String[] args) {
		int[] p=sort(new int[]{8,3,7,4,6,5});
		System.out.print("final:");
       for (int i = 0; i < p.length; i++) {
		 System.out.print(p[i]+",");
	   }
	}

}
