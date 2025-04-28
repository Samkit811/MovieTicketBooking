import java.time.LocalDateTime;

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

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}
