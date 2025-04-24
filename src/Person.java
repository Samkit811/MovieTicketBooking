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
}
