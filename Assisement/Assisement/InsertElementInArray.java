package Assesement_March2ND;

	public class InsertElementInArray {
		   public static void main(String[] args) {
		      int[] arr = {10, 20, 30, 40, 50};
		      int n = arr.length;
		      int pos = 2;
		      int value = 25;
		      int[] newArr = new int[n+1];
		      
		      for(int i = 0; i < n+1; i++) {
		         if(i < pos-1) {
		            newArr[i] = arr[i];
		         } else if(i == pos-1) {
		            newArr[i] = value;
		         } else {
		            newArr[i] = arr[i-1];
		         }
		      }
		      
		      System.out.println("Array after inserting " + value + " at position " + pos + ":");
		      for(int i = 0; i < n+1; i++) {
		         System.out.print(newArr[i] + " ");
		      }
		   }
		}


