package String;

public class Assement_1 {
	 public static void main(String[] args) {
	        String s= "Arjun was the great warrior";
	        int n =3;
	      
	        int partLength = s.length()/ n;
	        int startIndex = 0;
	        String[] parts = new String[n];
	        for (int i = 0; i < n; i++) {
	            parts[i] = s.substring(startIndex, startIndex + partLength);
	            startIndex += partLength;
	        }
	        
	        System.out.println("The string divided into " + n + " equal parts:");
	        for (String part : parts) {
	            System.out.println(part);
	 }
	        
}}
