package javacode;
import java.io.*;

public class Combinelists {

	static void combinelists(char arr1[], char arr2[],int n1, int n2, char arr3[])
	{
		int i = 0, j = 0, k = 0;
		
		while(i < n1 && j < n2) {
			arr3[k++] = arr1[i++];
			arr3[k++] = arr2[j++];
		}
		while(i < n1)
			arr3[k++] = arr1[i++];
		while(j < n2)
			arr3[k++] = arr2[j++];
	}
	public static void main(String[] args) {
		char arr1[] = {'a','b','c'};
		int n1 = arr1.length;
		
		char arr2[] = {'1','2','3'};
		int n2 = arr2.length;
		
		char arr3[] = new char[n1 + n2];
		combinelists(arr1,arr2,n1,n2,arr3);
		
		System.out.println("Array after merging");
		for(int i = 0; i < n1+ n2; i++)
			System.out.print(arr3[i] + " ");

	}

}
