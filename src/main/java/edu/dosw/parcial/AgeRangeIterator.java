public class AgeRangeIterator extends CriteriaIterator {
    public AgeRangeIterator(ShelterComponent shelter, int minAge, int maxAge) {
        super(shelter, p -> p.getAge() >= minAge && p.getAge() <= maxAge);
    }
}