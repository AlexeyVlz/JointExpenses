import java.util.List;

public class SessionManager {

    Session session = new Session("session_1");


    public List<Person> addPerson (Person person) {
        session.getPersons().add(person);
        return session.getPersons();
    }

    public List<Expense> addExpense (Expense expense) {
        session.getExpenses().add(expense);
        return session.getExpenses();
    }
}
