package MyPackage;

public class Main_Movie {
	public static void main(String[] args) {
		 Movie_Management_System m= new  Movie_Management_System();
		 m.setMovieName("Avenger The End Game");
		 m.setMovieStartTime(2);
		 m.setMovieEndTime(5);
		 m.setMovieTicketPrice(350);
		 
		 System.out.println("Movie name:"+m.getMovieName());
		 System.out.println("Starting time:"+ m.getMovieStartTime()+" "+" pm");
		 System.out.println("Ending time:"+ m.getMovieEndTime()+" "+" pm");
		 System.out.println("Movie Ticket Price: "+m.getMovieTicketPrice());
	}

}
