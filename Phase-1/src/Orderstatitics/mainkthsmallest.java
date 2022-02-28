package Orderstatitics;

public class mainkthsmallest {


		public static void main(String[] args) {
	    kthsmallest ob = new kthsmallest();
		       int arr[] = {12, 3, 5, 7, 4, 19, 26};
		       int n = arr.length,k = 4;
		       System.out.println("K'th smallest element is "+ ob.kthsmallest(arr, 0, n-1, k));
		   }
		}

