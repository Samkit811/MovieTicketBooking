import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Integer id;
    private List<Booking> bookingList;

    public Person(String name, Integer id){
        this.name = name;
        this.id = id;
        this.bookingList = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addBooking(Booking booking){
        this.bookingList.add(booking);
    }

    public void showBookingList(){
        System.out.println("Booking list for the person: " + this.name);
        for(Booking booking: this.bookingList){
            System.out.println("Movie Name: " + booking.getSeat().getShow().getMovie());
            System.out.println("Movie Time: " + booking.getSeat().getShow().getLocalDateTime());
            System.out.println("No of seat booked: " + booking.getNoOfSeat());
        }
    }
}
