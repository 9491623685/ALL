package Java;

public class Binary {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int key=20;
		int f=0;
		int l=a.length-1;
		int mid=(f+l)/2;
		while(f<=l)
		{
			if(a[mid]<key) {
			f=mid+1;
			}
			else if(a[mid]==key) {
				System.out.println("found"+mid);
			}
			else {
				l=mid-1;
			}
		}
		if(f>l)
		{
			System.out.println("element not found");
		}
	}

}
