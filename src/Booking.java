import java.util.Random;

public class Booking {
    private Integer id;
    private Seat seat;
    private Random random;
    private Integer noOfSeat;

    public Booking(Seat seat, Integer noOfSeat){
        this.seat = seat;
        this.random = new Random();
        this.id = this.random.nextInt(100);
        this.noOfSeat = noOfSeat;
    }

    public Seat getSeat() {
        return seat;
    }

    public Integer getNoOfSeat() {
        return noOfSeat;
    }
}
