import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Show {
    Map<LocalDateTime, List<Movie>> showList;

    public Show(){
        this.showList = new HashMap<>();
    }

    public void addMovie(LocalDateTime localDateTime, Movie movie){
        this.showList.computeIfAbsent(localDateTime, k -> new ArrayList<>()).add(movie);
    }

    public void displayShows() {
        for (Map.Entry<LocalDateTime, List<Movie>> entry : showList.entrySet()) {
            System.out.println("Time: " + entry.getKey());
            for (Movie movie : entry.getValue()) {
                System.out.println("   " + movie);
            }
        }
    }

    public void searchMovie(Movie searchedMovie) {
        for (Map.Entry<LocalDateTime, List<Movie>> entry : showList.entrySet()) {
            for (Movie movie : entry.getValue()) {
                if (movie.getName().equalsIgnoreCase(searchedMovie.getName())) {
                    System.out.println(searchedMovie.getName() + " is scheduled at " + entry.getKey());
                    return;
                }
            }
        }
        System.out.println(searchedMovie.getName() + " not found in the schedule.");
    }

}
