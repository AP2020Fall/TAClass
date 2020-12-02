package MVC_sample;

import java.util.Scanner;

public class View {
    Controller controller = Controller.getInstance();
    private static View view;

    public static View getView() {
        if (view == null)
            view = new View();
        return view;
    }

    private View() {
    }

    public void run() {
        String command;
        Scanner scanner = new Scanner(System.in);
        while (!(command = scanner.nextLine()).equals("end")) {
            String[] commands = command.split(" ");
            if (commands[0].equals("getNumber")) {
                getNumber();
            } else if (commands[0].equals("setNumber")) {
                setNumber(commands);
            }

        }
    }

    private void setNumber(String[] commands) {
        controller.setNumber(commands);
    }

    private void getNumber() {
        System.out.println(controller.getNumber());
    }
}
