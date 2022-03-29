import java.util.UUID;

public class Person {

    final private String name;
    final private UUID id;

    public Person(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }
}
