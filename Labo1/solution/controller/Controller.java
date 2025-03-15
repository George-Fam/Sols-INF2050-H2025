package controller;

import model.Model;
import model.ModelReadOnly;

/**
 * MVC controller acting as intermediate between view and model. The view uses the controller's
 * methods to modify the model, i.e. the view uses the offered "move" methods. Passing through
 * the controller ensures the game rules are respected.
 *
 * @author Maximilian Schiedermeier
 */
public class Controller {

  private Model model;

  /**
   * Controller created model on initialization.
   */
  public Controller() {
    this.model = new Model();
  }

  public ModelReadOnly getModel() {
    return model;
  }

  public boolean moveDown() {

    // reject if action would send figure out of array bounds
    if (model.getPosY() + 1 >= model.getBoardSize())
    // Cowardly refusing to move figure out of board.
    {
      return false;
    }

    // Otherwise: move figure
    model.setPosY(model.getPosY() + 1);
    return true;
  }

  public boolean moveRight() {

    // reject if action would send figure out of array bounds
    if (model.getPosX() + 1 >= model.getBoardSize())
    // Cowardly refusing to move figure out of board.
    {
      return false;
    }

    // Otherwise: move figure
    model.setPosX(model.getPosX() + 1);
    return true;
  }

  public boolean moveUp() {

    // reject if action would send figure out of array bounds
    if (model.getPosY() - 1 < 0)
    // Cowardly refusing to move figure out of board.
    {
      return false;
    }

    // Otherwise: move figure
    model.setPosY(model.getPosY() - 1);
    return true;
  }

  public boolean moveLeft() {

    // reject if action would send figure out of array bounds
    if (model.getPosY() - 1 < 0)
    // Cowardly refusing to move figure out of board.
    {
      return false;
    }

    // Otherwise: move figure
    model.setPosX(model.getPosX() - 1);
    return true;
  }
}