import java.util.Scanner ;
class search{
	public static void main(String[] args) {
		int num,l,r,mid,flag=0;
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6,7,8,9};
		l = 0;
		r = arr.length-1;
		System.out.print("Enter A Number To Search : ");
		num = sc.nextInt();
		while(l<=r){
			mid = (l+r)/2;
			if(arr[mid] == num ){
				System.out.print("Number Found At position "+ mid + 1 );
				flag = 1;
				break;
			}else if(arr[mid] < num){
					l = mid+1;
			}else{
				r = mid-1;
			}
		}
		if(flag == 0){
			System.out.print("Number Not Found ");
		}
	}
	
}