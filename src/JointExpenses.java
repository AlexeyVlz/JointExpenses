public class JointExpenses {
    public static void main(String[] args) {
        SessionManager sessionManager = new SessionManager();

        Person first = new Person("Sergey");
        first.setId(sessionManager.generateId());

        Person second = new Person("Alexey");
        second.setId(sessionManager.generateId());

        Person third = new Person("Roman");
        third.setId(sessionManager.generateId());

        Expense one = new Expense("One", first, 10_000);
        one.addPerson(second);
        one.addPerson(third);

        sessionManager.addExpense(one);


    }
}
