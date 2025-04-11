package view;

import controller.Controller;
import model.ModelReadOnly;

/**
 * Application entry point. This class interacts with the controller to move the figure from the
 * board's top left position to the bottom right, using exclusively the controller's "move"
 * methods. This class must not have direct access on model instances, i.e. access without using
 * the ModelReadOnly interface.
 *
 * @author Maximilian Schiedermeier
 */
public class View {

  public static void main(String[] args) {

    Controller controller = new Controller();
    ModelReadOnly model = controller.getModel();

    // Print model in initial state:
    printModel(model);

    // Move figure to bottom right
    for (int i = 0; i < 3; i++) {
      controller.moveRight();
      controller.moveDown();
    }

    // Print model again:
    printModel(model);
  }

  // Printing the model, by accessing the model internals:
  public static void printModel(ModelReadOnly model) {
    for (int y = 0; y < model.getBoard().length; y++) {
      for (int x = 0; x < model.getBoard()[y].length; x++) {
        if (model.getBoard()[x][y]) {
          System.out.print("[x]");
        } else {
          System.out.print("[ ]");
        }
      }
      System.out.println("");
    }
    System.out.println("");
  }
}