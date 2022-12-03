package addition;

public class arrays_sorting1 {
//selection sort
	public static void main(String[] args) {
		int [] arr= {2,5,6,7,9,1,3};
		//System.out.println("value of arr "+arr);
		/*for(int i=0;i<arr.length;i++) {
		
			System.out.println(arr[i]);
		}*/
			for(int i=0;i<arr.length;i++) {
			
				for(int j=1;j<(arr.length-i);j++) {
					if (arr[j-1]>arr[j]) {
						int temp =arr[j-1];
						arr[j-1]=arr[j];
						arr[j]=temp;
						
				}
			}
		}
		System.out.println("after swapping");
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
			
		}

	}

}
