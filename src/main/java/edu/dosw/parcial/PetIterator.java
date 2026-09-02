import java.util.function.Consumer;
public interface PetIterator {
    boolean hasNext();
    Pet next();
    void forEachRemaining(Consumer<? super Pet> action);
}