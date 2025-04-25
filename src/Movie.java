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

    public void updateBookedSeat() {
        this.bookedSeat++;
    }
}
