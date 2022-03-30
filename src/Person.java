

public class Person {
    GenerateNewId generateId = new GenerateNewId();

    final private String name;
    final private String id;

    public Person(String name) {
        this.name = name;
        this.id = generateId.generateId();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
