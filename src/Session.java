import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Session {

    final private String name;
    final private UUID id;
    final private List<Person> persons;
    final private List<Expense> expenses;

    public Session(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
        this.persons = new ArrayList<>();
        this.expenses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }
}
