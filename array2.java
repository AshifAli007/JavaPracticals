import java.util.Scanner;
class array2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int col,row;
		System.out.print("Enter The Number Of Row : ");
		row = sc.nextInt();
		System.out.print("\nEnter The Number Of Coloumn : ");
		col = sc.nextInt();
		int arr[][] = new int[row][col];
		System.out.println("Enter "+ col*row + " Elements ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr[i][j] = sc.nextInt();
			}
			
		}
		System.out.print("\nGiven Array Is :-\n");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}


	}
}