import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Date;

public class Expense {


    final private String name;
    private String id;
    final private Person from;
    final private List<Person> to;
    final private double amount;
    final private Date date;

    public Expense(String name, Person from, double amount) {
        this.name = name;
        this.from = from;
        this.to = new ArrayList<>();
        this.amount = amount;
        this.date = new Date();
    }

    public void setId(String id) {
        this.id = id;
    }

    public void addPerson (Person person) {
        to.add(person);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Person getFrom() {
        return from;
    }

    public List<Person> getTo() {
        return to;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }
}
