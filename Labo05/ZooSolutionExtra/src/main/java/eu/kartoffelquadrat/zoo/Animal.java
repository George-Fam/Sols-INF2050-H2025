package eu.kartoffelquadrat.zoo;

/**
 * Animal bean stores read only attributes of an immutable animal object and provides public getter
 * access.
 *
 * @author Maximilian Schiedermeier
 */
public class Animal {

  // private animal fields for species, age and favourite toy.
  private final String nom;
  private final String species;
  private final int age;
  private final String favouriteToy;

  /**
   * Constructor. Requires final values for animals species, age and toy.
   *
   * @param nom           as the animals name
   * @param species       as the animals species.
   * @param age           as the animals age in years.
   * @param favouriteToy as the animals preferred toy.
   */
  public Animal(String nom, String species, int age, String favouriteToy) {
    this.nom = nom;
    this.species = species;
    this.age = age;
    this.favouriteToy = favouriteToy;
  }

  /**
   * Getter for the animals name.
   *
   * @return the animals name as String
   */
  public String getNom() {
    return nom;
  }

  /**
   * Getter for the animals species.
   *
   * @return the animals species as String.
   */

  public String getSpecies() {
    return species;
  }

  /**
   * Getter for the animals age in years.
   *
   * @return the animals age in years.
   */
  public int getAge() {
    return age;
  }

  /**
   * Getter for the animals favourite food.
   *
   * @return the animals favourite food as String.
   */
  public String getFavouriteToy() {
    return favouriteToy;
  }

  /**
   * Custom toString method for convenient string representation of animal object.
   *
   * @return all field information of this animal object formatted as human readable string.
   */
  @Override
  public String toString() {
    StringBuilder animalStringBuilder = new StringBuilder("");
    animalStringBuilder.append(" (")
        .append(getAge())
        .append("), the ")
        .append(getSpecies())
        .append(". They like ")
        .append(getFavouriteToy())
        .append(".");
    return animalStringBuilder.toString();
  }
}