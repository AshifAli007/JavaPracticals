import java.util.Scanner ;
class prime{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number To Check if It Is A Prime Or Not :");
		int num = sc.nextInt();
		int flag = 0;
		for(int i=2;i<=Math.sqrt(num);i++){
			if(num%i == 0){
				System.out.print(num + " Is Not A Prime Number ");
				flag =1;
				break;
			}
		}
		if(flag == 0){
			System.out.print("Yes "+num +" Is A Prime Number ");
		}
	}
}