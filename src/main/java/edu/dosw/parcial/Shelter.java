import java.util.ArrayList;
import java.util.List;
public class Shelter extends ShelterComponent {
    private List<Pet> pets = new ArrayList<>();
    public Shelter(String name) { super(name); }
    public void addPet(Pet p) { pets.add(p); }
    @Override
    public List<Pet> getPets() { return pets; }
}