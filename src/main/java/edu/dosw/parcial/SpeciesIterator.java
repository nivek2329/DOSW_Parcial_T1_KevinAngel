public class SpeciesIterator extends CriteriaIterator {
    public SpeciesIterator(ShelterComponent shelter, String species) {
        super(shelter, p -> p.getSpecies().equalsIgnoreCase(species));
    }
}