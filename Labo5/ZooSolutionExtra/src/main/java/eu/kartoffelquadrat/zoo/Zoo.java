package eu.kartoffelquadrat.zoo;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Principal class of the Zoo, offering all relevant public functionality. Access to public methods
 * of this implementation is demonstrated in the DesktopLauncher class. This class is a singleton.
 *
 * @author Maximilian Schiedermeier
 */
public class Zoo {

  // Singleton reference
  private static Zoo SINGLETON_REFERENCE = null;

  // private fields for indexed animals and opening hours.
  private final Map<String, Animal> animals;
  private final OpeningHours openingHours;

  /**
   * Private constructor, populates the zoo.
   */
  private Zoo() {
    openingHours = new OpeningHours();
    animals = new LinkedHashMap<>();
    addDefaultAnimals();
    addDefaultAnimals();
    addDefaultAnimals();
  }

  private void addDefaultAnimals() {
    Animal animal1 = new Animal("Charly", "Chimpanzee", 10, "Bananas");
    Animal animal2 = new Animal("Nemo", "Clownfish", 4, "Plankton");
    Animal animal3 = new Animal("Dumbo", "Elephant", 13, "Peanuts");

    addAnimal(String.valueOf(animal1.hashCode()), animal1);
    addAnimal(String.valueOf(animal2.hashCode()), animal2);
    addAnimal(String.valueOf(animal3.hashCode()), animal3);
  }

  /**
   * Singleton patter access method.
   *
   * @return the one and only Zoo instance.
   */
  public static Zoo getInstance() {
    if (SINGLETON_REFERENCE == null) {
      SINGLETON_REFERENCE = new Zoo();
    }
    return SINGLETON_REFERENCE;
  }

  /**
   * Returns a list with all animal names.
   *
   * @return Collection with the names of all indexed animals.
   */
  public Collection<String> getAllAnimalNames() {
    return animals.values().stream()
        .map(Animal::getNom)
        .sorted()
        .collect(Collectors.toList());
  }

  /**
   * Getter to look up details on one specific animal, identified by hashcode.
   *
   * @param hashcode as the animal class s hashcode.
   * @return the animal object associated to this hashcode.
   */
  public Animal getAnimalDetails(String hashcode) {
    return animals.get(hashcode);
  }

  /**
   * Setter to add a new animal to the zoo.
   *
   * @param name   as the name of the animal to index.
   * @param animal as the characteristics of the animal to add.
   */
  public void addAnimal(String name, Animal animal) {
    animals.put(name, animal);
  }

  /**
   * Getter to retrieve the zoo opening hours.
   *
   * @return the zoo opening hours.
   */
  public OpeningHours getOpeningHours() {
    return openingHours;
  }


}