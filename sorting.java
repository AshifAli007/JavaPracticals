class sorting{
	public static void main(String[] args) {
		int arr[] = {1,7,5,9,5,0,1,234,-6};
		int sorted[] = new int[arr.length];
		int k = 0;
		int size = arr.length;
		int index=0;
		int min=0;
		while(size != 0){
			min = arr[0];
			index = 0;
			for(int i=0;i<size;i++){
				if(arr[i]<=min){
					min = arr[i];
					index = i;
				}
			}
			sorted[k++] = min;
			for(int j=index;j<size-1 ;j++){
				arr[j] = arr[j+1];
			}
			size--;
		}
		for(int i=0;i<k;i++){
			System.out.print(sorted[i]+ " ");
		}
	}
}