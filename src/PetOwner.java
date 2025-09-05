/**
 * PetOwner class represents a person who can own and care for pets.
 * Complete the TODOs below to create a working PetOwner class.
 */
public class PetOwner {

    private String firstname;
    private String lastname;
    // - String firstName (owner's first name)
    // - String lastName (owner's last name)


    /**
     * Constructor creates a new pet owner
     *
     * @param firstName owner's first name
     * @param lastName  owner's last name
     */
    public PetOwner(String firstName, String lastName) {
        this.firstname = firstName;
        this.lastname = lastName;
        // HINT: this.firstName = firstName;


    }

    /**
     * Returns the owner's full name
     *
     * @return first name + " " + last name
     */
    public String getFullName() {
        return firstname + " " + lastname;
        // HINT: return firstName + " " + lastName;

    }

    /**
     * Adopts a pet by setting this person as the pet's owner
     *
     * @param pet the pet to adopt
     */
    public void adoptPet(Pet pet) {
        pet.setOwner(this);
        // HINT: pet.setOwner(this);
        System.out.println(pet.name + " was adopted by " + getFullName());

        // Then print: "[owner's full name] adopted [pet name]!"
        // HINT: Use getFullName() and pet.name

    }

    /**
     * Feeds a pet, but only if this person owns it
     *
     * @param pet the pet to feed
     */
    public void feedPet(Pet pet) {
        if (pet.owner == this) {
            pet.feed();
        } else {
            System.out.println(getFullName() + "Cannot feed " + pet.name + " because it's not their pet");
        }
        // IF pet.owner == this (this person owns the pet):
        //    Call pet.feed()
        // ELSE (this person doesn't own the pet):
        //    Print "[owner's full name] cannot feed [pet name] - not their pet!"

        // HINT: Use an if-else statement
        // if (pet.owner == this) {
        //     pet.feed();
        // } else {
        //     System.out.println(getFullName() + " cannot feed " + pet.name + " - not their pet!");
        // }

    }
}