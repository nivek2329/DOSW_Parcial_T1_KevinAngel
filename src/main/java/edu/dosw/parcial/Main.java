import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        ShelterGroup redNacional = new ShelterGroup("Red Nacional ECI Paw Connect");
        ShelterGroup bogota = new ShelterGroup("Ciudad: Bogotá");
        Shelter norte = new Shelter("Refugio Norte");
        Shelter sur = new Shelter("Refugio Sur");
        bogota.add(norte);
        bogota.add(sur);
        ShelterGroup medellin = new ShelterGroup("Ciudad: Medellín");
        Shelter central = new Shelter("Refugio Central");
        medellin.add(central);
        ShelterGroup cali = new ShelterGroup("Ciudad: Cali");
        Shelter oeste = new Shelter("Refugio Oeste");
        cali.add(oeste);
        redNacional.add(bogota);
        redNacional.add(medellin);
        redNacional.add(cali);
        norte.addPet(new Pet("PERRO-001", "Max", "PERRO", 24, "MEDIANO", true, true, true, "Norte - Bogota"));
        norte.addPet(new Pet("PERRO-002", "Bruno", "PERRO", 72, "GRANDE", true, false, false, "Norte - Bogota"));
        norte.addPet(new Pet("GATO-001", "Luna", "GATO", 18, "PEQUEÑO", true, true, true, "Norte - Bogota"));
        sur.addPet(new Pet("PERRO-003", "Toby", "PERRO", 12, "PEQUEÑO", true, true, true, "Sur-Bogota"));
        sur.addPet(new Pet("GATO-002", "Milo", "GATO", 48, "MEDIANO", false, true, true, "Sur-Bogota"));
        sur.addPet(new Pet("CONEJO-001", "Copito", "CONEJO", 10, "PEQUEÑO", true, true, true, "Sur-Bogota"));
        central.addPet(new Pet("PERRO-004", "Rocky", "PERRO", 60, "GRANDE", false, false, false, "Ctral-Medellin"));
        central.addPet(new Pet("GATO-003", "Nala", "GATO", 30, "PEQUEÑO", true, true, true, "Ctral-Medellin"));
        central.addPet(new Pet("AVE-001", "Kiwi", "AVE", 20, "PEQUEÑO", true, false, true, "Ctral-Medellin"));
        oeste.addPet(new Pet("PERRO-005", "Simon", "PERRO", 36, "MEDIANO", true, true, true, "Oeste-Cali"));
        oeste.addPet(new Pet("REPTIL-001", "Rocco", "REPTIL", 84, "PEQUEÑO", false, false, true, "Oeste-Cali"));
        oeste.addPet(new Pet("GATO-004", "Zoe", "GATO", 8, "PEQUEÑO", true, true, true, "Oeste-Cali"));
        
        System.out.println("Escenario #1: Por Especie");
        PetIterator it1 = new SpeciesIterator(redNacional, "PERRO");
        List<Pet> res1 = new ArrayList<>();
        it1.forEachRemaining(res1::add);
        res1.forEach(p -> System.out.println("  " + p));
        System.out.println("Total encontrados: " + res1.size() + " perros\n");
        
        System.out.println("Escenario #2: Por Rango de edad");
        PetIterator it2 = new AgeRangeIterator(redNacional, 12, 36);
        List<Pet> res2 = new ArrayList<>();
        it2.forEachRemaining(res2::add);
        res2.forEach(p -> System.out.println("  " + p));
        System.out.println("Total encontrados: " + res2.size() + " mascotas\n");
        
        System.out.println("Escenario #3: Por Compatibilidad");
        PetIterator it3 = new CompatibilityIterator(redNacional, true, true, true);
        List<Pet> res3 = new ArrayList<>();
        it3.forEachRemaining(res3::add);
        res3.forEach(p -> System.out.println("  " + p));
        System.out.println("Total encontrados: " + res3.size() + " mascotas\n");
        
        System.out.println("Escenario #4: Por Refugio");
        PetIterator it4 = new ShelterIterator(norte);
        List<Pet> res4 = new ArrayList<>();
        it4.forEachRemaining(res4::add);
        System.out.println("Total encontrados:");
        System.out.println("  " + norte.getName() + " - " + res4.size() + " mascotas\n");
        
        System.out.println("Escenario #5: Por Refugio");
        PetIterator it5 = new ShelterIterator(redNacional);
        List<Pet> res5 = new ArrayList<>();
        it5.forEachRemaining(res5::add);
        System.out.println("Total encontrados:");
        System.out.println("  " + redNacional.getName() + " - " + res5.size() + " mascotas\n");
    }
}