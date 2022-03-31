import java.util.List;
import java.util.UUID;

public class SessionManager implements IdGenerator{
    Session session = new Session("session");

    public List<Person> addPerson (Person person) {
        session.getPersons().add(person);
        return session.getPersons();
    }

    public List<Expense> addExpense (Expense expense) {
        session.getExpenses().add(expense);
        return session.getExpenses();
    }

    @Override
    public String generateId() {
        return String.valueOf(UUID.randomUUID());
    }
}
