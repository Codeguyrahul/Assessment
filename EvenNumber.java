package CollectionEg;

import java.util.ArrayList;


public class EvenNumber {

	   ArrayList<Integer> A1 = new ArrayList<Integer>();
	   ArrayList<Integer> A2 = new ArrayList<Integer>();

	     ArrayList<Integer> storeEvenNumbers(int N) {
	        for (int i = 2; i <= N; i+= 2) {
	            A1.add(i);
	        }
	        return A1;
	    }

	    ArrayList<Integer> printEvenNumbers() {
	        for (int i = 0; i < A1.size(); i++) {
	            int evenNumber = A1.get(i);
	            int Mn = evenNumber * 2;
	            A2.add(Mn);
	        }
	 
	        System.out.println(A2.toString().replace("[", "").replace("]", "").replace(",", ""));
	        return A2;
	    }

	     int retrieveEvenNumber(int N) {
	        if (A1.contains(N)) {
	            return N;
	        }
	        return 0;
	    }

	    
	        public static void main(String[] args) {
	            EvenNumber evenNumbers = new EvenNumber();
	            ArrayList<Integer> A1 = evenNumbers.storeEvenNumbers(20);
	            System.out.println("A1: " + A1.toString().replace("[", "").replace("]", "").replace(",", ""));
	            ArrayList<Integer> A2 = evenNumbers.printEvenNumbers();
	            int retrievedNumber = evenNumbers.retrieveEvenNumber(8);
	            System.out.println("Retrieved number: " + retrievedNumber);
	        }
	    }


