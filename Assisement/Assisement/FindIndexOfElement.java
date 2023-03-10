package Assesement_March2ND;


public class FindIndexOfElement {
	   public static void main(String[] args) {
	      int[] arr = {10, 20, 30, 40, 50};
	      int n = arr.length;
	      int elementToFind = 30;
	      int index = -1;
	      
	      for(int i = 0; i < n; i++) {
	         if(arr[i] == elementToFind) {
	            index = i;
	            break;
	         }
	      }
	      
	      if(index == -1) {
	         System.out.println("Element not found in array");
	      } else {
	         System.out.println("Index of element " + elementToFind + " is " + index);
	      }
	   }
	}
