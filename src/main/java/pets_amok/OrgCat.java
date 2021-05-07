package pets_amok;

public class OrgCat extends VirtualPet implements OrganicPet {

    private int hunger;
    private int thirst;
    private int litterBoxCleanliness;

    public OrgCat(String name, int health, int hunger, int thirst, int happiness, String description, int litterBoxCleanliness) {
        super(name, health, happiness, description);
        this.hunger = hunger;
        this.thirst = thirst;
        this.litterBoxCleanliness = litterBoxCleanliness;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getLitterBoxCleanliness() {
        return litterBoxCleanliness;
    }

    @Override
    public void clean() {
        litterBoxCleanliness -= 20;
        happiness -= 25;
        health -= 20;
    }

    @Override
    public void feed() {
        hunger -= 10;
        health -= 2;
        happiness -= 5;
    }

    @Override
    public void water() {
        thirst -= 10;
        health -= 2;
        happiness -= 5;
    }

    @Override
    public String toString() {
        return getName() + "    " + getHealth() + "    " + getHunger() + "       " + getThirst() + "       " + getHappiness() + "          " + getLitterBoxCleanliness() + "        " + getDescription();
    }

    @Override
    public void tick() {
        litterBoxCleanliness += 5;
        happiness += 1;
        hunger += 5;
        thirst += 5;

        if (litterBoxCleanliness > 35) {
            happiness += 20;
            health += 15;
        }
    }
}
