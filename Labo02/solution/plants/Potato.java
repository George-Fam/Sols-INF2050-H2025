package plants;

/**
 * Potatos, also known as Solanum Tuberosum are common plants and as such provide all stipulated
 * by the common Plant interface. This potato class provides implementations for doing photo-
 * synthesis as well as drinking water.
 *
 * @author Maximilian Schiedermeier
 */
public class Potato implements Plant {

  /**
   * Default constructor.
   */
  public Potato() {
  }

  @Override
  public String doPhotoSynthesis() {
    return "Oh, sunbeams. I love warm sunbeams!";
  }

  @Override
  public String drinkWater() {
    return "Slurp... aah!";
  }
}
