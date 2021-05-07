package pets_amok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboPetTest {

    RoboPet underTest;
    RoboDog roboDog1;
    RoboCat roboCat1;

    @BeforeEach
    public void setUp(){
        roboDog1 = new RoboDog("dog",20,20,20,20,"metal");
        roboCat1 = new RoboCat("cat", 20,20,20,20,"metal");
    }

    @Test
    public void oilRoboPets(){
        roboDog1.giveOil();
        roboCat1.giveOil();
        assertEquals(roboDog1.getOilLvl(),10);
        assertEquals(roboCat1.getOilLvl(),10);
    }

    @Test
    public void maintainAllRoboPets(){
        roboDog1.preformMaintenance();
        roboCat1.preformMaintenance();
        assertEquals(roboDog1.getMaintenanceLvl(),10);
        assertEquals(roboCat1.getMaintenanceLvl(),10);
    }

    @Test
    public void walkRoboDog(){
        roboDog1.walkAllDogs();
        assertEquals(roboDog1.getHappiness(),5);
    }

}
