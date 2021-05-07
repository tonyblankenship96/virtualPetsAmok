package pets_amok;

public class OrgDog extends VirtualPet implements OrganicPet, DogDuties {

    private int hunger;
    private int thirst;
    private int cageCleanliness;

    public OrgDog(String name, int health, int hunger, int thirst, int happiness, String description, int cageCleanliness) {
        super(name, health, happiness, description);
        this.hunger = hunger;
        this.thirst = thirst;
        this.cageCleanliness = cageCleanliness;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getCageCleanliness() {
        return cageCleanliness;
    }

    @Override
    public void clean() {
        cageCleanliness -= 20;
        happiness -= 15;
        health -= 20;
    }

    @Override
    public void feed() {
        hunger -= 10;
        health -= 2;
        happiness -= 2;
    }

    @Override
    public void water() {
        thirst -= 10;
        health -= 2;
        happiness -= 2;
    }

    @Override
    public void walkAllDogs() {
        happiness -= 15;
        cageCleanliness -= 10;
        health -= 8;
    }

    @Override
    public String toString() {
        return getName() + "     " + getHealth() + "    " + getHunger() + "       " + getThirst() + "       " + getHappiness() + "          " + getCageCleanliness() + "       " + getDescription();
    }

    @Override
    public void tick() {
        happiness += 5;
        hunger += 5;
        thirst += 5;
        cageCleanliness += 5;

        if (cageCleanliness > 35) {
            happiness += 20;
            health += 15;
        }
    }
}
