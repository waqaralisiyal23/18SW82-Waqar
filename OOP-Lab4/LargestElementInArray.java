class LargestElementInArray{
	public static void main(String[]args)
	{
		int []arr=new int[]{5,6,2,9,10,14,18,9,2,8};
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println("Largest Element in array is "+max);
	}
}