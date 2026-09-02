public class ShelterIterator extends CriteriaIterator {
    public ShelterIterator(ShelterComponent shelter) {
        super(shelter, p -> true);
    }
}