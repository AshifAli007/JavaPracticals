import java.util.Scanner;
class matrix{
	int a[][] = new int[10][10] ;
	int b[][] = new int[10][10];
	int r1,c1,r2,c2;
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The number of rows in first array: ");
		r1 = sc.nextInt();
		System.out.print("Enter The Number Of Coloumn in first array : ");
		c1 = sc.nextInt();
		System.out.print("Enter "+ r1*c1 +" Elements Of 1st array :-\n");
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				a[i][j] = sc.nextInt();
			}
		}
		System.out.print("\nEnter The number of rows in 2nd array: ");
		r2 = sc.nextInt();
		System.out.print("Enter The Number Of Coloumn in 2nd array : ");
		c2 = sc.nextInt();
		System.out.print("Enter "+ r2*c2 +" Elements Of 1st array :-\n");
		for(int i=0;i<r2;i++){
			for(int j=0;j<c2;j++){
				b[i][j] = sc.nextInt();
			}
		}

	}
	void sum(){
		int c[][] = new int[r1][c1];
		if(r1!=r2 || c1!=c2){
			System.out.print("Invalid : Number Of Rows Or Coloumns Are Not Equal");
			return;
		}else{
			for(int i=0;i<r1;i++){
				for(int j=0;j<c1;j++){
					c[i][j] = a[i][j] + b[i][j];
				}
			}
			System.out.print("\nSum Of Array 1 And Array 2 Is :-\n");
			for(int x[]:c){
				for(int y:x){
					System.out.print(y + " ");
				}
				System.out.println();
			}

		}
		

	}
	void multiply(){
		int c[][] = new int[r1][c2];
		for(int i=0;i<r1;i++){
			for(int j=0;j<c2;j++){
				for(int k=0;k<c1;k++){
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		System.out.println("Multiplication of array 1 and array 2 is:- ");
		for(int x[]:c){
			for(int y:x){
				System.out.print(y + " ");
			}
			System.out.println();
		}

	}
}
class array2d{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		matrix m = new matrix();
		do{
			int n;
			System.out.println("Choose 1 To Sum The Arrays");
			System.out.println("Choose 2 To Multiply The Arrays");
			System.out.println("Enter Your Choice : ");
			n = sc.nextInt();
			if(n==1){
				m.input();
				m.sum();
			}else if(n==2){
				m.input();
				m.multiply();
			}
			System.out.print("\nDo You Want to Continue(y/n) : ");
			ch = sc.next().charAt(0);
			
		}while(ch=='y' || ch=='Y');
		m.sum();
	}
}