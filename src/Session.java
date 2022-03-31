import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Session {

    final private String name;
    private String id;
    final private List<Person> persons;
    final private List<Expense> expenses;

    public Session(String name) {
        this.name = name;
        this.persons = new ArrayList<>();
        this.expenses = new ArrayList<>();
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }


}
