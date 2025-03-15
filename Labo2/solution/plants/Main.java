package plants;

/**
 * Main class for the Lab02 session solution.
 * Creates a bunch of plants/carnivorous plants, strictly ties objects to their interfaces, and
 * various types of flies to carnivorous plants.
 *
 * @author Maximilian Schiedermeier
 */
public class Main {

  /**
   * Default constructor.
   */
  public Main() {
  }

  /**
   * Main program function.
   *
   * @param args no arguments required.
   */
  public static void main(String[] args) {

    // Create a plant and a carnivorous plant instance.
    Plant normalPlant = new Potato();
    CarnivorousPlant carnivorousPlant = new PitcherPlant();

    // Let both do some photosynthesis:
    System.out.println("Doing photosynthesis:");
    System.out.println(normalPlant.doPhotoSynthesis());
    System.out.println(carnivorousPlant.doPhotoSynthesis());

    // Let both enjoy a sip of water
    System.out.println("Serving water:");
    System.out.println(normalPlant.drinkWater());
    System.out.println(carnivorousPlant.drinkWater());

    // On top of that, let the carnivorous plant eat two types of flies
    Fly fly1 = new FruitFly();
    Fly fly2 = new HoverFly();
    System.out.println("Feeding flies:");
    System.out.println(carnivorousPlant.eatFly(fly1));
    System.out.println(carnivorousPlant.eatFly(fly2));
  }
}
