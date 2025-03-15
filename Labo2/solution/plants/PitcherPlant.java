package plants;


/**
 * Pitcher Plant class. The pitcher plant is a south american carnivorous plant, attracting and
 * eating flies for additional nutrients. As part of the Carnivorous Plant family it provides an
 * implementation for all plant, as well as all carnivorous plant interfaces methods.
 *
 * @author Maximilian Schiedermeier
 */
public class PitcherPlant implements CarnivorousPlant {

  /**
   * Default constructor.
   */
  public PitcherPlant() {
  }

  @Override
  public String doPhotoSynthesis() {
    return "Oh, sunbeams. I like sunbeams, but I like flies even more.";
  }

  @Override
  public String drinkWater() {
    return "Slurp... good water, but could use some extra nutrients.";
  }

  @Override
  public String eatFly(Fly fly) {
    return fly.makeAnnoyingSound()+"... CHOMP!!!!   That was delicious! Yummy! Thank you!";
  }
}
