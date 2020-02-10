import java.util.Scanner;
class Binary{
	public static void main(String[] args) {
		System.out.print("Enter A Number In Decimal Form : ");
		Scanner sc = new Scanner(System.in);
		int dec,num;
		dec = sc.nextInt();
		num = dec;
		//string s;
		int binary[] = new int[10];
		int m=0;
		while(num != 0){
			binary[m++] = num%2;
			num = num/2;
		}
		System.out.print("\n" + dec + " In Binary : ");
		for(int i=m-1;i>=0;i--){
			System.out.print(binary[i]);
		}
                System.out.println("\n\n");
	}
}