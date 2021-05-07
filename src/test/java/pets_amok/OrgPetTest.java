package pets_amok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrgPetTest {

    OrganicPet underTest;
    OrgDog orgDog1;
    OrgCat orgCat1;

    @BeforeEach
    public void setUp(){
        orgDog1 = new OrgDog("OrgDog", 20, 20, 20, 20, "DOG", 20);
        orgCat1 = new OrgCat("OrgCat", 20,20,20,20,"CAT", 20);
    }


    @Test
    public void feedAllOrgAnimals(){
        orgDog1.feed();
        orgCat1.feed();
        assertEquals(orgDog1.getHunger(),10);
        assertEquals(orgCat1.getHunger(),10);
    }

    @Test
    public void  waterAllOrgAnimals(){
        orgDog1.water();
        orgCat1.water();
        assertEquals(orgDog1.getThirst(),10);
        assertEquals(orgCat1.getThirst(),10);
    }

    @Test
    public void walkOrgDog(){
        orgDog1.walkAllDogs();
        assertEquals(orgDog1.getHappiness(), 5);
    }

    @Test
    public void cleanDogCage(){
        orgDog1.clean();
        assertEquals(orgDog1.getCageCleanliness(),0);
    }

    @Test
    public void cleanLitterBox(){
        orgCat1.clean();
        assertEquals(orgCat1.getLitterBoxCleanliness(),0);
    }

}
