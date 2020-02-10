import java.util.Scanner;
class prac7{
	public static void main(String[] args) {
		int total;
		Scanner sc = new Scanner(System.in);
		if(args.length==0){
			System.out.print("Enter Total Number Of Integers : ");
			total = sc.nextInt();
		}
		else{
			total = Integer.parseInt(args[0]);
		}
		int arr[] = new int[total];
		System.out.print("\nEnter "+ total + " Integer Value :-\n");
		int sum = 0;
		for(int i=0;i<total;i++){
				arr[i] = sc.nextInt();
				sum = sum +arr[i];
		}
		// for(int i=0;i<total;i++){
		// 		cin>>arr[i];
		// }
		System.out.println("\nSum Of Integers Is : "+ sum);

	}
}