package java_test;

public class Sum1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len=10;
		int sum=0;
		int a[]=new int[len];
		for(int i=0;i<a.length;++i){
			a[i]=i+1;
		}
		for(int i=0;i<a.length;i++){
			sum += a[i];
		}
		System.out.print(sum);
	}
	

}
