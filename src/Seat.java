public class Seat {
    private Person person;
    private Show show;

    public Seat(Person person, Show show){
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
