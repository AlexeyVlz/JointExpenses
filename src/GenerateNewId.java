import java.util.UUID;

public class GenerateNewId implements IdGenerator{

    @Override
    public String generateId() {
        return String.valueOf(UUID.randomUUID());
    }
}
