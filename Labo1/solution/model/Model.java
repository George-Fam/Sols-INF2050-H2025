package model;

/**
 * Unprotected model of the MVC sample application. Whoever holds a true (non interface)
 * reference to objects of this class has full read and write access to the model. Following MVC,
 * the view must never have full access to instances of this class. The mode represents a 4x4
 * board with a single figure.
 *
 * @author Maximilian Schiedermeier
 */
public class Model implements ModelReadOnly {

  // position of the figure is stored as private fields, to prevent external manipulation.
  private int posX;
  private int posY;

  // board dimensions
  private final int boardSize = 4;

  public Model() {

    // Initialize figure position to top left.
    posX = 0;
    posY = 0;
  }

  public int getPosX() {
    return posX;
  }

  public void setPosX(int posX) {
    this.posX = posX;
  }

  public int getPosY() {
    return posY;
  }

  public void setPosY(int posY) {
    this.posY = posY;
  }

  public int getBoardSize() {
    return boardSize;
  }

  @Override
  public boolean[][] getBoard() {
    boolean[][] boardRepresentation = new boolean[4][4];
    for (int y = 0; y < boardRepresentation.length; y++) {
      for (int x = 0; x < boardRepresentation[y].length; x++) {
        boardRepresentation[y][x] = false;
      }
    }
    boardRepresentation[posY][posX] = true;
    return boardRepresentation;
  }

}