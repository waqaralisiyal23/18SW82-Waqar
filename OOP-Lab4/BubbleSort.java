
class BubbleSort{
	    public static void  bubbleSort(int A[],int N){ //where N is number of elements in an array
		int round,i,temp;
		for(round=1;round<=N-1;round++){        //both loops run till size-1 of array
			for(i=0;i<=(N-1)-round;i++){ 
				if(A[i]>A[i+1]){
					temp=A[i];
					A[i]=A[i+1];
					A[i+1]=temp;
				}
			}
		} //end of outer for
	}
	public static void main(String[]args)
	{
		int arr[]={4,8,1,9,7};
		int i;
		System.out.print("Array before sorting: ");
		for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		bubbleSort(arr,5);
		System.out.println();
		System.out.print("Array after sorting: ");
		for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}
}