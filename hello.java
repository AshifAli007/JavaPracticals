class hello{
	public static void main(String[] args) {
		//System.out.println("hello World"+ "\n" +args[0]);
		int len = args.length;
		float sum = 0;
		if(len <=0 ){
			System.out.println("No Argument Entered");
			//exit();
		}else{
			
			for(int i=0;i<len;i++){
				float j = Float.parseFloat(args[i]);
				sum += j;
			}
		}
		
		System.out.println("Sum Is : "+ sum);
	}
}