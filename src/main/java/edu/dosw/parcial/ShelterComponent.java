import java.util.List;
public abstract class ShelterComponent {
    protected String name;
    public ShelterComponent(String name) { this.name = name; }
    public String getName() { return name; }
    public abstract List<Pet> getPets();
}