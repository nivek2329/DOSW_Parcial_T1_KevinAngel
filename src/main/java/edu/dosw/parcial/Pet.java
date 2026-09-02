public class Pet {
    private String id;
    private String name;
    private String species;
    private int age;
    private String size;
    private boolean compatKids;
    private boolean compatPets;
    private boolean compatSmallSpaces;
    private String shelterName;

    public Pet(String id, String name, String species, int age, String size, boolean compatKids, boolean compatPets, boolean compatSmallSpaces, String shelterName) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.age = age;
        this.size = size;
        this.compatKids = compatKids;
        this.compatPets = compatPets;
        this.compatSmallSpaces = compatSmallSpaces;
        this.shelterName = shelterName;
    }
    public String getId() { return id; }
    public String getName() { return name; }
    public String getSpecies() { return species; }
    public int getAge() { return age; }
    public String getSize() { return size; }
    public boolean isCompatKids() { return compatKids; }
    public boolean isCompatPets() { return compatPets; }
    public boolean isCompatSmallSpaces() { return compatSmallSpaces; }
    public String getShelterName() { return shelterName; }
    @Override
    public String toString() { return id + " " + name + " " + age + " meses"; }
}