import java.util.Objects;

public class Movie {
    private Integer id;
    private String name;
    private Integer capacity;
    private Integer bookedSeat;

    public Movie(Integer id, String name, Integer capacity){
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.bookedSeat = 0;
    }

    public String getName() {
        return name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public Integer getId() {
        return id;
    }

    public void setBookedSeat(Integer bookedSeat) {
        this.bookedSeat = bookedSeat;
    }

    public Integer getBookedSeat() {
        return bookedSeat;
    }

    public void updateBookedSeat(Integer noOfSeats) {
        this.bookedSeat+=noOfSeats;
    }

    public Boolean bookSeat(Integer noOfSeats){
        if(Objects.equals(this.bookedSeat, this.capacity)){
            System.out.println("Show is Full");
            return false;
        }
        if(this.bookedSeat + noOfSeats > this.capacity){
            System.out.println("Not Able to book " + noOfSeats + " seats");
            return true;
        }
        System.out.println("Congratulations, You have booked " + noOfSeats + " seats in Movie: " + this.name);
        this.updateBookedSeat(noOfSeats);
        return true;
    }
}
