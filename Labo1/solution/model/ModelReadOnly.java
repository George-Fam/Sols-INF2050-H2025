package model;

/**
 * Read only interface for the MVC model. It must not be possible to modify model state, using
 * the methods offered by this interface.
 *
 * @author Maximilian Schiedermeier
 */
public interface ModelReadOnly {

  /**
   * Retruns a 2d representation of the model. Only a single field in the matrix must be true,
   * and indicated the position of the figure on the board.
   *
   * @return 2d boolean array with exatly one field true.
   */
  boolean[][] getBoard();
}
