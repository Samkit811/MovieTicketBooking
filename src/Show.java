import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Show {
    private LocalDateTime localDateTime;
    private Movie movie;

    public Show(LocalDateTime localDateTime, Movie movie){
        this.localDateTime = localDateTime;
        this.movie = movie;
    }

    public Movie getMovie() {
        return movie;
    }

}
