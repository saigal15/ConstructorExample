package constructor.mommsen.com;

public class ConstructorExample {
	 int num1;
	 int num2;
	public ConstructorExample(int a, int b){
	
		num1 = a;
		num2 = b;
		
	}
	public void add(){
		int result = num1 + num2;
		System.out.println("The added value is:" + result );
	}
	public void sub(){
		int result = num1 - num2;
		System.out.println("The subtracted value is:" + result);
	}
	public void multiplication(){
		int result = num1 * num2;
		System.out.println("The multiplied value is:" + result);
	}
	public void division(){
		int result = num1 / num2;
		System.out.println("The divided value is:" + result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorExample constEx = new ConstructorExample(5,5);
		
		constEx.add();
		constEx.sub();
		constEx.multiplication();
		constEx.division();
	

	}

}
