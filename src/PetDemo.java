/**
 * PetDemo demonstrates the Pet and PetOwner classes working together.
 * Complete the TODOs below to create a working demonstration.
 */
public class PetDemo {
    public static void main(String[] args) {
        System.out.println("=== Simple Pet System ===\n");

        Pet Buddy = new Pet("Buddy", "dog");
        Pet Fluffy = new Pet("Fluffy", "cat");
        // Create a dog named "Buddy": Pet buddy = new Pet("Buddy", "dog");
        // Create a cat named "Fluffy": Pet fluffy = new Pet("Fluffy", "cat");


        PetOwner alice = new PetOwner("Alice", "Smith");
        PetOwner bob = new PetOwner("Bob", "Jones");
        // Create Alice Smith: PetOwner alice = new PetOwner("Alice", "Smith");
        // Create Bob Jones: PetOwner bob = new PetOwner("Bob", "Jones");


        // Show initial status
        System.out.println("=== Initial Pet Status ===");
        Buddy.displayInfo();
        Fluffy.displayInfo();
        // Call buddy.displayInfo();
        // Call fluffy.displayInfo();

        System.out.println();

        // Demonstrate adoptions
        System.out.println("=== Adoptions ===");
        alice.adoptPet(Buddy);
        bob.adoptPet(Fluffy);
        // Call alice.adoptPet(buddy);
        // Call bob.adoptPet(fluffy);

        System.out.println();

        // Show updated status
        System.out.println("=== Updated Pet Status ===");
        Buddy.displayInfo();
        Fluffy.displayInfo();
        // Call buddy.displayInfo();
        // Call fluffy.displayInfo();

        System.out.println();

        // Demonstrate feeding with ownership validation
        System.out.println("=== Feeding Time ===");
        alice.feedPet(Buddy);
        alice.feedPet(Fluffy);
        bob.feedPet(Fluffy);

        // 1. Alice feeds Buddy (should work - Alice owns Buddy)
        // 2. Alice tries to feed Fluffy (should fail - Alice doesn't own Fluffy)  
        // 3. Bob feeds Fluffy (should work - Bob owns Fluffy)
        // Call alice.feedPet(buddy);
        // Call alice.feedPet(fluffy);
        // Call bob.feedPet(fluffy);


        System.out.println("\n=== Demo Complete ===");
    }
}