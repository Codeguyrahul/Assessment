package Assesement_March2ND;


	public class CopyArray {
		   public static void main(String[] args) {
		      int[] arr1 = {10, 20, 30, 40, 50};
		      int n = arr1.length;
		      int[] arr2 = new int[n];
		      
		      for(int i = 0; i < n; i++) {
		         arr2[i] = arr1[i];
		      }
		      
		      System.out.println("Contents of original array:");
		      for(int i = 0; i < n; i++) {
		         System.out.print(arr1[i] + " ");
		      }
		      
		      System.out.println("\nContents of copied array:");
		      for(int i = 0; i < n; i++) {
		         System.out.print(arr2[i] + " ");
		      }
		   }
		}


