/**
 * Pet class represents a simple pet animal.
 * Complete the TODOs below to create a working Pet class.
 */
public class Pet{


    public String name;
    public String type;
    public boolean isHappy;
    public PetOwner owner;
    // - String name (pet's name)
    // - String type (what kind of animal - dog, cat, bird, etc.)
    // - boolean isHappy (whether the pet is happy)
    // - PetOwner owner (reference to who owns this pet)


    /**
     * Constructor creates a new pet
     * @param name the pet's name
     * @param type what kind of animal (dog, cat, bird, etc.)
     */
    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
        this.isHappy = true;
        this.owner = null;
            // HINT: this.name = name;
            // HINT: this.owner = null;

        }

        /**
         * Feeds the pet, making them happy
         */
        public void feed () {
            isHappy = true;
            System.out.println(name+" has been fed");

        }

        /**
         * Sets who owns this pet
         * @param newOwner the person who will own this pet
         */
        public void setOwner (PetOwner newOwner){
            this.owner = newOwner;
            newOwner.getFullName();
            System.out.println(name+" now belongs to "+ newOwner.getFullName());
            // Set: this.owner = newOwner;
            // Print: "[pet name] now belongs to [owner's full name]!"
            // HINT: Use newOwner.getFullName() to get the owner's name

        }

        /**
         * Displays all information about this pet
         */
        public void displayInfo () {
            // This method is provided for you - no TODO needed
            System.out.print("Name: " + name + ", Type: " + type + ", Happy: " + isHappy + ", Owner: ");
            if (owner == null) {
                System.out.println("None");
            } else {
                System.out.println(owner.getFullName());
            }
    }
}