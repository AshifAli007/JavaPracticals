import java.util.Scanner;
class factorial{
	public static void main(String[] args) {
		int fact = 1;
		System.out.println("Enter A Number To Find Factorial : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=num;i>0;i--){
			fact = fact*i;
		}
		System.out.print(fact);
	}
}