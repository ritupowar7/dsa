import java.util.Scanner;

public class A1_Q4_Main {
	static int linearSearch(int[] arr, int key, int n) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				n--;
				if(n==0) return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 11, 22, 33, 44, 56, 78, 99, 78 ,78};
		System.out.print("Enter Element = ");
		int ele = sc.nextInt();
		System.out.print("Enter n occurence = ");
		int n = sc.nextInt();
		int index = linearSearch(arr, ele, n);
		if (index > -1)
			System.out.println(n+" Occurence of "+ele+" Element found at index = " + index);
		else
			System.out.println("Element not found");

		sc.close();
	}
}