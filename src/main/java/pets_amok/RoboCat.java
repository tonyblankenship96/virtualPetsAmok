package pets_amok;

public class RoboCat extends VirtualPet implements RoboPet {

    private int oilLvl;
    private int maintenanceLvl;

    public RoboCat(String name, int health, int oilLvl, int maintenanceLvl, int happiness, String description) {
        super(name, health, happiness, description);
        this.oilLvl = oilLvl;
        this.maintenanceLvl = maintenanceLvl;
    }

    public int getOilLvl() {
        return oilLvl;
    }

    public int getMaintenanceLvl() {
        return maintenanceLvl;
    }

    @Override
    public void giveOil() {
        oilLvl -= 10;
        happiness -= 4;
        health -= 5;
    }

    @Override
    public void preformMaintenance() {
        maintenanceLvl -= 10;
        happiness -= 4;
        health -= 8;
    }

    @Override
    public String toString() {
        return getName() + "    " + getHealth() + "        " + getOilLvl() + "            " + getMaintenanceLvl() + "             " + getHappiness() + "     " + getDescription();
    }

    @Override
    public void tick() {
        health += 4;
        oilLvl += 7;
        maintenanceLvl += 6;
        happiness += 3;
    }
}
