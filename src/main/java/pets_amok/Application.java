package pets_amok;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        VirtualPetShelter myShelter = new VirtualPetShelter();

        OrgDog dog = new OrgDog("Dude", 25, 25, 25, 25, "Brown and hyper", 5);
        OrgCat cat = new OrgCat("Kitty", 25, 25, 25, 25, "Super Lazy", 7);
        RoboDog roboDog = new RoboDog("Buddy", 25, 25, 25, 25, "Weird dog machine");
        RoboCat roboCat = new RoboCat("Nala", 25, 25, 25, 25, "Metal cat thingy");

        myShelter.add(dog);
        myShelter.add(cat);
        myShelter.add(roboDog);
        myShelter.add(roboCat);

        String userInput;

        System.out.println("Thank you for volunteering to help out at Tony's Virtual Pet Shelter!");
        System.out.println("");

        do {
            System.out.println("This is the status of our current pets: ");
            System.out.println("");
            System.out.println("Name  Health  Hunger  Thirst  Happiness  Cleanliness  description");
            myShelter.showOrgPetInfo();
            System.out.println("");
            System.out.println("Name  Health  Oil level  Maintenance level  Happiness  description");
            myShelter.showRoboPetInfo();
            System.out.println("");

            System.out.println("How would you like to help?");
            System.out.println("");
            System.out.println("1. Give the organic pets food");
            System.out.println("2. Give the organic pets water");
            System.out.println("3. Oil the robo pets");
            System.out.println("4. Preform maintenance on the robo pets");
            System.out.println("5. Walk all the dogs");
            System.out.println("6. Clean the dog cages");
            System.out.println("7. Clean the litter box");
            System.out.println("8. Adopt a pet");
            System.out.println("9. Admit a pet");
            System.out.println("10. Leave");

            userInput = input.nextLine();

            if (userInput.equals("1")) {
                myShelter.feed();
            } else if (userInput.equals("2")) {
                myShelter.water();
            } else if (userInput.equals("3")) {
                myShelter.giveOil();
            } else if (userInput.equals("4")) {
                myShelter.preformMaintenance();
            } else if (userInput.equals("5")) {
                myShelter.walkAllDogs();
            } else if (userInput.equals("6")) {
                myShelter.cleanDogCage();
            } else if (userInput.equals("7")) {
                myShelter.cleanCatBox();
            } else if (userInput.equals("8")) {
                System.out.println("Which pet would you like to adopt?");
                myShelter.showPetNames();
                String adoptedPet = input.nextLine();
                myShelter.remove(adoptedPet);
            } else if (userInput.equals("9")) {
                System.out.println("What is the name of the pet we are admitting?");
                String admitPet = input.nextLine();
                System.out.println("Can you give a description of the pet");
                String newPetDesc = input.nextLine();
                System.out.println("What kind of animal is it?");
                System.out.println("1. Organic Dog");
                System.out.println("2. Organic Cat");
                System.out.println("3. Robo Dog");
                System.out.println("4. Robo Cat");
                String newPetType = input.nextLine();
                if (newPetType.equals("1")) {
                    myShelter.add(new OrgDog(admitPet, 25, 25, 25, 25, newPetDesc, 0));
                } else if (newPetType.equals("2")) {
                    myShelter.add(new OrgCat(admitPet, 25, 25, 25, 25, newPetDesc, cat.getLitterBoxCleanliness()));
                } else if (newPetType.equals("3")) {
                    myShelter.add(new RoboDog(admitPet, 25, 25, 25, 25, newPetDesc));
                } else if (newPetType.equals("4")) {
                    myShelter.add(new RoboCat(admitPet, 25, 25, 25, 25, newPetDesc));
                }

            }

            myShelter.tick();

        } while (!userInput.equals("10"));
        System.out.println("Thanks for helping out! Come back soon!!");
    }


}
