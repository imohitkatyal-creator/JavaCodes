package arrays;

import java.util.Scanner;

import arrays.practicsProblems.Pair;

public class practicsProblems {
	static class Pair{
		int min;
		int max;
	}
	public static int[] takeInput(int n) {
		Scanner s=new Scanner(System.in);
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void reverseArray(int arr[]) {
		int temp,start=0,end=arr.length-1;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	public static Pair minMax(int arr[]) {
		Pair minMax=new Pair(); 
		int i;
		if(arr.length%2==0) {
			if(arr[0]<arr[1]) {
				minMax.min=arr[0];
				minMax.max=arr[1];
			}else {
				minMax.min=arr[1];
				minMax.max=arr[0];
			}
			i=2;
		}else {
			minMax.min=arr[0];
			minMax.max=arr[0];
			i=1;
		}
		while(i<arr.length-1) {
		if(arr[i]>arr[i+1]) {
			if(arr[i]>minMax.max) {
				minMax.max=arr[i];
			}
			if(arr[i+1]<minMax.min) {
				minMax.min=arr[i+1];
			}
		}else {
			if(arr[i+1]>minMax.max) {
				minMax.max=arr[i+1];
			}
			if(arr[i]<minMax.min) {
				minMax.min=arr[i];
			}
		}
		i+=2;
		}
		return minMax;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=takeInput(n);
//		reverseArray(arr);
		Pair ans=minMax(arr);
		System.out.println(ans.min+" "+ans.max);
//		printArray(arr);
	}

}
