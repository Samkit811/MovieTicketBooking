public class Seat {
    private Person person;
    private Integer id;
    private Show show;

    public Seat(Person person, Integer id, Show show){
        this.id = id;
        this.person = person;
        this.show = show;
    }

    public Person getPerson() {
        return person;
    }

    public Show getShow() {
        return show;
    }
}
