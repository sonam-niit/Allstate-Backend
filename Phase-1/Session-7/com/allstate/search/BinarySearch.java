package com.allstate.search;

public class BinarySearch {

	public static void binarySearch(int arr[], int key) {

		int lb=0;
		int ub=arr.length-1;
		int mid= (lb+ub)/2;
		while(lb<=ub) {
			if(arr[mid]<key)
			{
				lb=mid+1;
			}
			else if(arr[mid]==key)
			{
				System.out.println("Element found at index "+mid+" element "+arr[mid]);
				break;
			}
			else {
				ub=mid-1;
			}
			
			mid=(lb+ub)/2;
		}
		if(lb>ub) {
			System.out.println("Element not found");
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {3,6,9,12,15};
		binarySearch(arr, 12);
		binarySearch(arr, 18);
	}
}
