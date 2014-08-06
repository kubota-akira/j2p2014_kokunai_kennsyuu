package java_test;

public class Sample5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=100;i++){
			System.out.print("*");
			try{
				Thread.sleep(50);
			}
		catch(InterruptedException e){
			;
		}
		}
		System.out.println();
		
	}

}
