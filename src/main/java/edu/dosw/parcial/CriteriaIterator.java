import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
public class CriteriaIterator implements PetIterator {
    private final Iterator<Pet> iterator;
    public CriteriaIterator(ShelterComponent shelter, Predicate<Pet> criteria) {
        this.iterator = shelter.getPets().stream().filter(criteria).iterator();
    }
    @Override
    public boolean hasNext() { return iterator.hasNext(); }
    @Override
    public Pet next() { return iterator.next(); }
    @Override
    public void forEachRemaining(Consumer<? super Pet> action) { iterator.forEachRemaining(action); }
}