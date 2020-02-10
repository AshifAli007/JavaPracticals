import java.util.Scanner;
class array1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Size Of Array : ");
		int len = sc.nextInt();
		int arr[] = new int[len];
		System.out.println("Enter "+ len + " Elements ");
		for(int i=0;i<len;i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Given Array Is :");
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");
		}


	}
}