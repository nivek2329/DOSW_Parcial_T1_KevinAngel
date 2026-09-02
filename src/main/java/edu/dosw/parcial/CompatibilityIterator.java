public class CompatibilityIterator extends CriteriaIterator {
    public CompatibilityIterator(ShelterComponent shelter, boolean kids, boolean otherPets, boolean smallSpaces) {
        super(shelter, p -> (!kids || p.isCompatKids()) && (!otherPets || p.isCompatPets()) && (!smallSpaces || p.isCompatSmallSpaces()));
    }
}