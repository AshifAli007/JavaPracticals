import java.util.Scanner;
class linear{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int len = arr.length;
		
		int flag = 0;
		System.out.print("Enter A Number To Search : ");
		int num = sc.nextInt();
		for(int i=0;i<len;i++){
			if(arr[i] == num){
				System.out.print("Number Found At Position : " + i);
				flag = 1;
				break;
			}
		}
		if(flag == 0){
			System.out.print("Number Not Found ");
		}

	}
}