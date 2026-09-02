import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class ShelterGroup extends ShelterComponent {
    private List<ShelterComponent> children = new ArrayList<>();
    public ShelterGroup(String name) { super(name); }
    public void add(ShelterComponent component) { children.add(component); }
    @Override
    public List<Pet> getPets() {
        return children.stream().flatMap(c -> c.getPets().stream()).collect(Collectors.toList());
    }
}