package chainAlg;

import java.util.ArrayList;
import java.util.List;

public class GetQQ {
	/**
	 *规则：把第一个删了，第二个放到最后，循环往复，删除的顺序作为结果
	 * @param array
	 * @return
	 */
	public  static List<Integer>  sort(int[] array){
		List<Integer> tmp=new ArrayList<Integer>();
		List<Integer>out=new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			tmp.add(array[i]);
		}
		int j=0;
		while(tmp.size()>0){
			if(j==0){
				out.add(tmp.get(0));
				tmp.remove(0);
				j=1;
			}else{
				tmp.add(tmp.get(0));
				tmp.remove(0);
				j=0;
			}
		}
		return out;
	}
	public static void main(String[] args) {
		List<Integer> p= sort(new int[]{6,3,1,7,5,8,9,2,4});
		  for (int i = 0; i < p.size(); i++) {
			  System.out.print(p.get(i)+",");
		}
	}

}
