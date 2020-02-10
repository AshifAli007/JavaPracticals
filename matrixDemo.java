import java.util.Scanner;
class matrix{
	int arr[][];
	int row,col;
	matrix(int r,int c){
		row = r;
		col = c;
		arr = new int[r][c];
	}
	void input(){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
					arr[i][j] = sc.nextInt();
			}
		}
	}
	void display(){
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
					System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	matrix sum(matrix obj){
			if(row!=obj.row || col!=obj.col){
				System.out.println("\nAddition not possible on these matrices\n\n");
				return null;
			}
			matrix m = new matrix(row,col);
			for(int i=0;i<row;i++){
				for(int j=0;j<col;j++){
					m.arr[i][j] = arr[i][j] + obj.arr[i][j];
				}
			}
			System.out.print("Addition ->\n");
			return m;
	}
	matrix multiply(matrix obj){
		if(col!=obj.row){
			System.out.print("\nMuliplication not possible on these matrices\n\n");
			return null;
		}
		matrix m = new matrix(row,obj.col);
		for(int i=0;i<row;i++){
			for(int j=0;j<obj.col;j++){
				for(int k=0;k<col;k++){
					m.arr[i][j] += arr[i][k]*obj.arr[k][j];
				}
			}
		}
		System.out.print("Multiplication ->\n");
		return m;	
	}
	matrix rotate_clockwise(){
		matrix m = new matrix(col,row);
		for(int i=0,k=0;i<col;i++,k++){
			for(int j=row-1,l=0;j>=0;j--,l++){
				m.arr[k][l] = arr[j][i];
			}
		}
		return m;
	}
	matrix rotate_anti(){
		matrix m = new matrix(col,row);
		for(int i=col-1,k=0;i>=0;i--,k++){
			for(int j=0,l=0;j<row;j++,l++){
				m.arr[k][l] = arr[j][i];
			}
		}
		return m;
	}

}
class matrixDemo{
	public static void main(String[] args) {
		int r1,c1,r2,c2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Rows And Coloumn of 1st matrix :-\n");
		r1 = sc.nextInt();
		c1 = sc.nextInt();
		matrix a = new matrix(r1,c1);
		System.out.print("Enter "+r1*c1+" elements of 1st array :-\n");
		a.input();
		System.out.print("\nEnter The Rows And Coloumn of 2nd matrix :-\n");
		r2 = sc.nextInt();
		c2 = sc.nextInt();
		matrix b = new matrix(r2,c2);
		System.out.print("Enter "+r2*c2+" elements of 2nd array :-\n");
		b.input();
		
		System.out.print("\n1st Array is :-\n");
		a.display();
		System.out.print("\n2nd Array is :-\n");
		b.display();
		int choice,ch;
		do{
				System.out.print("\nEnter 1 To Sum The Matrices \n");
				System.out.print("Enter 2 To Multiply The Matrices \n");
				System.out.print("Enter 3 To rotate a matrix \n");
				System.out.print("Enter Your Choice : ");
				choice = sc.nextInt();
				switch(choice){
					case 1 :{ 
								matrix c;
								c = a.sum(b);
								c.display();
								break;
							}
					case 2 :{ 
								matrix c;
								c = a.multiply(b);
								c.display();
								break;
							}
					case 3 :{
								matrix c ;
								c = a.rotate_clockwise();
								System.out.print("Rotating 1st Array clockwise :-\n");
								c.display();
								c = a.rotate_anti();
								System.out.print("Rotating 1st array anti-clockwise :-\n");
								c.display();
								break;
							}
				}
				System.out.print("Do You Want To Continue(y/n) : ");
				ch = sc.next().charAt(0);


		}while(ch=='y' || ch=='Y');

	}
}