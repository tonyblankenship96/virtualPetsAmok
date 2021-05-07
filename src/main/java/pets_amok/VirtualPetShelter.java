package pets_amok;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> pets = new HashMap<>();

    public void add(VirtualPet petToAdd) {
        pets.put(petToAdd.getName(), petToAdd);
    }

    public void remove(String pet) {
        pets.remove(pet);
    }

    public void feed() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof OrganicPet) {
                ((OrganicPet) pet).feed();
            }
        }
    }

    public void water() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof OrganicPet) {
                ((OrganicPet) pet).water();
            }
        }
    }

    public void tick() {
        for (VirtualPet pet : pets.values()) {
            pet.tick();
        }
    }

    public void showPetNames() {
        for (VirtualPet pet : pets.values()) {
            System.out.println(pet.getName());
        }
    }

    public void showRoboPetInfo() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof RoboPet) {
                System.out.println(pet);
            }
        }
    }

    public void showOrgPetInfo() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof OrganicPet) {
                System.out.println(pet);
            }
        }
    }

    public void cleanCatBox() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof OrgCat) {
                ((OrgCat) pet).clean();
            }
        }
    }

    public void cleanDogCage() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof OrgDog) {
                ((OrgDog) pet).clean();
            }
        }
    }

    public void giveOil() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof RoboPet) {
                ((RoboPet) pet).giveOil();
            }
        }
    }

    public void preformMaintenance() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof RoboPet) {
                ((RoboPet) pet).preformMaintenance();
            }
        }
    }

    public void walkAllDogs() {
        for (VirtualPet pet : pets.values()) {
            if (pet instanceof DogDuties) {
                ((DogDuties) pet).walkAllDogs();
            }
        }
    }
}



