package Assesement_March2ND;


	public class RemoveElementFromArray {
		   public static void main(String[] args) {
		      int[] arr = {10, 20, 30, 40, 50};
		      int n = arr.length;
		      int elementToRemove = 30;
		      
		      int[] newArr = new int[n-1];
		      int j = 0;
		      for(int i = 0; i < n; i++) {
		         if(arr[i] != elementToRemove) {
		            newArr[j] = arr[i];
		            j++;
		         }
		      }
		      
		      System.out.println("Array after removing " + elementToRemove + ":");
		      for(int i = 0; i < n-1; i++) {
		         System.out.print(newArr[i] + " ");
		      }
		   }
		}

