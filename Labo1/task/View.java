public class View {

    public static void main(String[] args) {

        Controller controller = new Controller();
        Model model = controller.getModel();

        // Print model in initial state:
        printModel(model);

        // Move (illegally!) figure directly to target position
        // Two issues: 1: unsafe, the view has full access to model, can completely corrupt state. 2: view has knowledge about internal model implementation.
        model.board[0][0] = true;
        model.board[3][3] = true;

        // Print model again:
        printModel(model);
    }

    // Printing the model, by accessing the model internals:
    public static void printModel(Model model) {
        for (int y = 0; y < model.board.length; y++) {
            for (int x = 0; x < model.board[y].length; x++) {
                if (model.board[x][y])
                    System.out.print("[x]");
                else
                    System.out.print("[ ]");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}