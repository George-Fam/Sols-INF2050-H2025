package plants;

/**
 * Fruit flies are one class of flies that are of tiny size and make an annoying high pitch sound
 * when in the air.
 *
 * @author Maximilian Schiedermeier
 */
public class FruitFly implements Fly {

  /**
   * Default constructor.
   */
  public FruitFly() {
  }

  @Override
  public String getName() {
    return "FruitFly";
  }

  @Override
  public String makeAnnoyingSound() {
    return "Bziiiiiiiiiiiiiiiii";
  }
}
