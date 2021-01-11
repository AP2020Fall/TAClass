import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    Socket socket;
    Scanner scanner;
    DataInputStream dataInputStream;
    DataOutputStream dataOutputStream;
    boolean hasSignedIn = false;
    boolean firstMessage = true;

    public static void main(String[] args) {
        new Client().connect();
    }

    public void connect() {
        try {
            socket = new Socket("127.0.0.1", 8888);
            System.out.println("Successfully connected to server!");
            handleConnection();
        } catch (IOException e) {
            System.err.println("Error starting client!");
        }
    }

    private void handleConnection() {
        try {
            scanner = new Scanner(System.in);
            dataInputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            dataOutputStream = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
            String userInput = "";
            while (!userInput.equalsIgnoreCase("end")) {
                while (!hasSignedIn) {
                    signIn();
                }
                if (firstMessage) {
                    System.out.println("Enter one of these commands:\n" +
                            "print (first | second) number\n" +
                            "save as (first | second) number\n" +
                            "add - subtract - multiply - divide\n" +
                            "square root - log - abstract value\n" +
                            "sin - cos - tan - cot");
                    firstMessage = false;
                }
                userInput = scanner.nextLine();
                dataOutputStream.writeUTF(userInput);
                dataOutputStream.flush();
                String response = dataInputStream.readUTF();
                System.out.println(response);
                if (userInput.equals("end"))
                    return;
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private void signIn() throws IOException {
        System.out.println("Enter one of these commands : register, login");
        String input = scanner.nextLine();
        if (input.equals("register"))
            register();
        else if (input.equals("login"))
            login();
        else System.out.println("invalid command");
    }

    private void login() throws IOException {
        System.out.println("Enter Username:");
        String username = scanner.nextLine();
        System.out.println("Enter Password:");
        String password = scanner.nextLine();
        String message = "login" + username + "," + password;
        dataOutputStream.writeUTF(message);
        dataOutputStream.flush();
        String response = dataInputStream.readUTF();
        if (response.equals("Failure")) {
            System.err.println("Incorrect Credentials! Please Try Again.");
        } else {
            System.out.println("Successfully logged in!");
            hasSignedIn = true;
        }
    }

    private void register() throws IOException {
        System.out.println("Enter Username:");
        String username = scanner.nextLine();
        System.out.println("Enter Password:");
        String password = scanner.nextLine();
        String message = "register" + username + "," + password;
        dataOutputStream.writeUTF(message);
        dataOutputStream.flush();
        String response = dataInputStream.readUTF();
        if (response.equals("Failure")) {
            System.err.println("username is not free! Please Try Again.");
        } else {
            System.out.println("Successfully registered and logged in!");
            hasSignedIn = true;
        }
    }
}
