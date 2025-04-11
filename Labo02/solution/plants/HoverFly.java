package plants;

/**
 * Hoverflies are one class of flies that are of medium size and make an annoying intermediate
 * buzzing sound when in the air.
 *
 * @author Maximilian Schiedermeier
 */
public class HoverFly implements Fly {

  /**
   * Default constructor.
   */
  public HoverFly() {
  }

  @Override
  public String getName() {
    return "HoverFly";
  }

  @Override
  public String makeAnnoyingSound() {
    return "Bzuuuuuuuuuuuuu Bzz Bzz Bzuuuuuu";
  }
}
