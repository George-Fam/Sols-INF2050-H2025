package plants;

/**
 * Interface for plants that eat flies.
 */
public interface CarnivorousPlant extends Plant {

  /**
   * Lets the carnivorous plant eat a fly.
   *
   * @param fly as the fly to be eaten (annoying sound will be played first).
   * @return the plants answer to being fed with a fly.
   */
  String eatFly(Fly fly);
}
