package eu.kartoffelquadrat.zoo;

/**
 * Desktop Launcher demonstrates main functionality of the Zoo implementation.
 *
 * @author Maximilian Schiedermeier
 */
public class DesktopLauncher {
  /**
   * Main launcher method. No arguments required.
   *
   * @param args an optional string array. Parameters are discarded.
   */
  public static void main(String[] args) {

    // Creating a zoo, it comes with some default data right upon creation.
    Zoo zoo = Zoo.getInstance();

    // Just a little demo on how to access / modify the zoo...
    System.out.println("Welcome to the Zoo!");
    System.out.println("The zoo is open:");
    System.out.println(zoo.getOpeningHours());
    System.out.println("Come and visit out gorgeous animals:");
    System.out.println(zoo.getAllAnimalNames());

    // Modify the zoo by adding a new animal:
    System.out.println("Meet our newest members:");
    Animal baloo = new Animal("Baloo", "Black Bear", 8, "honey");
    Animal maya = new Animal("Baloo", "Honey Bee", 1, "flowers");
    zoo.addAnimal(String.valueOf(baloo.hashCode()), baloo);
    zoo.addAnimal(String.valueOf(maya.hashCode()), maya);
    System.out.println("\tBaloo" + zoo.getAnimalDetails(String.valueOf(baloo.hashCode())));
    System.out.println("\tMaya" + zoo.getAnimalDetails(String.valueOf(maya.hashCode())));
  }
}
