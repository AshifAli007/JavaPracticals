import java.util.Scanner;
class rotate{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		do{
			System.out.print("Enter The Rows And Coloumn of Array :-\nRows : ");
			int r = sc.nextInt();
			System.out.print("Coloumns : ");
			int c = sc.nextInt();
			int a[][] = new int[r][c];
			System.out.print("\nEnter "+r*c+" Elements Of Array :-\n");
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					a[i][j] = sc.nextInt();
				}
			}
			System.out.print("\nGiven Array Is :-\n");
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			clockwise(a,r,c);
			anti(a,r,c);
			System.out.print("Do You Want To Continue (y/n)");
			ch = sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}
	static void clockwise(int arr[][],int r,int c){
		System.out.println("\nArray After Rotating Clockwise :-");
			for(int i=0;i<c;i++){
				for(int j=r-1;j>=0;j--){
					System.out.print(arr[j][i]+" ");
				}
				System.out.println();
			}
	}
	static void anti(int arr[][],int r,int c){
		System.out.println("\nArray After Rotating Anti-Clockwise :-");
		for(int i=c-1;i>=0;i--){
				for(int j=0;j<r;j++){
					System.out.print(arr[j][i]+" ");
				}
				System.out.println();
		}
	}
}