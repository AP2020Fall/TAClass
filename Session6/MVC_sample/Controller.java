package MVC_sample;

public class Controller {
    private Controller() {
    }

    private static Controller controller;

    public static Controller getInstance() {
        if (controller == null)
            controller = new Controller();
        return controller;
    }

    public int getNumber() {

        return Model.number;
    }

    public void setNumber(String[] commands) {
        Model.number = Integer.parseInt(commands[1]);
    }
}
