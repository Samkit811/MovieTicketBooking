import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MovieBooking {
    private HashMap<LocalDateTime, List<Show>> showList;

    public MovieBooking(){
        this.showList = new HashMap<>();
    }

    public void registerShow(LocalDateTime localDateTime, Movie movie){
        Show show = new Show(localDateTime, movie);
        List<Show> showsAtTime = this.showList.getOrDefault(localDateTime, new ArrayList<>());
        showsAtTime.add(show);
        System.out.println("Added the show for the movie: " + movie.getName() + " at time: " + localDateTime);
        this.showList.put(localDateTime, showsAtTime);
    }

    // TO display the show list on any particular time
    private List<Show> viewShowList(LocalDateTime localDateTime){
        List<Show> shows = this.showList.get(localDateTime);
        return shows;
    }

    private Movie findMovie(List<Show> shows, String movieName){
        for(Show show: shows){
            if(show.getMovie().getName().equalsIgnoreCase(movieName)){
                return show.getMovie();
            }
        }
        return null;
    }

    private Boolean bookMovieTicket(Movie movie, Integer noOfTickets){
        return movie.bookSeat(noOfTickets);
    }

    public void bookTicket(LocalDateTime localDateTime, String movieName, Integer noOfTicket){
        List<Show> shows = this.viewShowList(localDateTime);
        Movie movie = this.findMovie(shows, movieName);
        if(this.bookMovieTicket(movie, noOfTicket)){
            System.out.println("Thanks for Purchase.");
        }
    }
}
