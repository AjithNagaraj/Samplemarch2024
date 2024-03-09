package withoutmaven;

public class class2 {
	public static void main(String[] args) {
		int [] a={5,4,3,2,1,0,1,2,3,4,0,5};
		int l=a.length;
		int temp=0;
		for(int i=0;i<l;i++){
		for(int j=0;j<l;j++){
		if(a[i]>a[j]){
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		



		}
		
		}
		}
		System.out.println(temp);

		



		
	}

}
