public class Person {
    private String name;
    private Integer id;

    public Person(String name, Integer id){
        this.name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
