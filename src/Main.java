import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------Starting the Program----------");

        Person person1 = new Person("Alice", 1);
        Person person2 = new Person("Bob", 2);
        Person person3 = new Person("Charlie", 3);
        Person person4 = new Person("Diana", 4);
        Person person5 = new Person("Ethan", 5);

        MovieBooking movieBooking = new MovieBooking();

        Movie movie1 = new Movie(1, "Inception", 150);
        Movie movie2 = new Movie(2, "Interstellar", 200);
        Movie movie3 = new Movie(3, "The Dark Knight", 180);
        Movie movie4 = new Movie(4, "Avengers: Endgame", 250);
        Movie movie5 = new Movie(5, "Titanic", 220);
        Movie movie6 = new Movie(6, "The Godfather", 100);
        Movie movie7 = new Movie(7, "Jurassic Park", 160);
        Movie movie8 = new Movie(8, "The Matrix", 140);
        Movie movie9 = new Movie(9, "Toy Story", 120);
        Movie movie10 = new Movie(10, "Frozen", 130);

        movieBooking.registerShow(LocalDateTime.of(2025, 4, 28, 14, 0), movie1);
        movieBooking.registerShow(LocalDateTime.of(2025, 4, 28, 17, 0), movie2);
        movieBooking.registerShow(LocalDateTime.of(2025, 4, 28, 20, 0), movie3);
        movieBooking.registerShow(LocalDateTime.of(2025, 4, 29, 14, 0), movie4);
        movieBooking.registerShow(LocalDateTime.of(2025, 4, 29, 17, 0), movie5);
        movieBooking.registerShow(LocalDateTime.of(2025, 4, 29, 20, 0), movie6);
        movieBooking.registerShow(LocalDateTime.of(2025, 4, 30, 14, 0), movie7);
        movieBooking.registerShow(LocalDateTime.of(2025, 4, 30, 17, 0), movie8);
        movieBooking.registerShow(LocalDateTime.of(2025, 4, 30, 20, 0), movie9);
        movieBooking.registerShow(LocalDateTime.of(2025, 5, 1, 14, 0), movie10);

        movieBooking.bookTicket(LocalDateTime.of(2025, 4, 28, 14, 0), "Inception", 5, person1);

        System.out.println("------------Complete the program-------------");

    }
}