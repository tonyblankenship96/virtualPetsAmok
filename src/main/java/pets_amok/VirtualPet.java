package pets_amok;

public abstract class VirtualPet {

    protected String name;
    protected int health;
    protected int happiness;
    protected String description;

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getHappiness() {
        return happiness;
    }

    public String getDescription() {
        return description;
    }

    public VirtualPet(String name, int health, int happiness, String description) {
        this.name = name;
        this.health = health;
        this.happiness = happiness;
        this.description = description;
    }

    public abstract void tick();
}
