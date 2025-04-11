package plants;

/**
 * Common interface for all flies. All fly classes must implement this interface.
 *
 * @author Maximilian Schiedermeier
 */
public interface Fly {

  /**
   * Getter to return string representation of class instances. Can be used to determine exact
   * type of a fly object.
   *
   * @return String representation of class name.
   */
  String getName();

  /**
   * Returns the specific sound a fly object makes when in the air. All flies make some kind of
   * sound.
   *
   * @return String representation of the annoying sound made by a fly.
   */
  String makeAnnoyingSound();

}
