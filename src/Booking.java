import java.util.Random;

public class Booking {
    private Integer id;
    private Seat seat;
    private Random random;

    public Booking(Seat seat){
        this.seat = seat;
        this.random = new Random();
        this.id = this.random.nextInt(100);
    }
}
