import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        run();
    }

    static void run() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true) {
            Socket clientSocket;
            try {
                System.out.println("Waiting for Client...");
                clientSocket = serverSocket.accept();
                System.out.println("A client Connected!");
                DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(clientSocket.getOutputStream()));
                DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(clientSocket.getInputStream()));
                new ClientHandler(clientSocket, dataOutputStream, dataInputStream).start();
            } catch (Exception e) {
                System.err.println("Error in accepting client!");
                break;
            }
        }
    }

    static class ClientHandler extends Thread {
        Socket clientSocket;
        DataOutputStream dataOutputStream;
        DataInputStream dataInputStream;
        Calculator calculator;
        User user;
        Double lastValue = 0.0;

        public ClientHandler(Socket clientSocket, DataOutputStream dataOutputStream, DataInputStream dataInputStream) {
            this.clientSocket = clientSocket;
            this.dataOutputStream = dataOutputStream;
            this.dataInputStream = dataInputStream;
            this.calculator = Calculator.getCalculator();
        }


        @Override
        public void run() {
            try {
                String input;
                while (true) {
                    input = dataInputStream.readUTF();
                    if (user != null)
                        System.out.println("Client with username " + user.username + " sent : " + input);
                    else System.out.println("A client sent : " + input);
                    dataOutputStream.writeUTF(answerClient(input));
                    dataOutputStream.flush();
                    System.out.println("server answered : " + input);
                    if (input.equals("end")) {
                        System.out.println("Connection closed!!!");
                        break;
                    }
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }

        }

        private String answerClient(String input) {
            String answer;
            if (input.startsWith("register"))
                answer = register(input);
            else if (input.startsWith("login"))
                answer = login(input);
            else if (input.equals("end"))
                answer = end();
            else answer = arithmetic(input);
            return answer;
        }

        private String register(String input) {
            int commaIndex = input.indexOf(",");
            String username = input.substring(9, commaIndex);
            String password = input.substring(commaIndex + 1);
            for (User user : User.users)
                if (user.username.equals(username))
                    return "Failure";
            this.user = new User(username, password);
            return "Success";
        }

        private String login(String input) {
            int commaIndex = input.indexOf(",");
            String username = input.substring(6, commaIndex);
            String password = input.substring(commaIndex + 1);
            for (User user : User.users) {
                if (user.username.equals(username) && user.password.equals(password)) {
                    this.user = user;
                    System.out.println("Logged in user with username : " + username + " and password : " + password);
                    return "Success";
                }
            }
            return "Failure";
        }

        private String end() {
            return "bye bye";
        }

        private String arithmetic(String input) {
            if (input.contains("first-number")) {
                if (user.firstNumber == null)
                    return "first number is null";
                else input = input.replace("first number", user.firstNumber.toString());
            }
            if (input.contains("second-number")) {
                if (user.secondNumber == null)
                    return "second number is null";
                else input = input.replace("second number", user.secondNumber.toString());
            }
            String answer;
            if (input.equals("print first number"))
                answer = firstNumber();
            else if (input.equals("print second number"))
                answer = secondNumber();
            else if (input.equals("save as first number"))
                answer = saveAsFirstValue();
            else if (input.equals("save as second number"))
                answer = saveAsSecondValue();
            else if (input.startsWith("add"))
                answer = add(input);
            else if (input.startsWith("subtract"))
                answer = subtract(input);
            else if (input.startsWith("multiply"))
                answer = multiply(input);
            else if (input.startsWith("divide"))
                answer = divide(input);
            else if (input.startsWith("square root"))
                answer = squareRoot(input);
            else if (input.startsWith("log"))
                answer = log(input);
            else if (input.startsWith("sin"))
                answer = sin(input);
            else if (input.startsWith("cos"))
                answer = cos(input);
            else if (input.startsWith("tan"))
                answer = tan(input);
            else if (input.startsWith("cot"))
                answer = cot(input);
            else if (input.startsWith("abstract value"))
                answer = abstractValue(input);
            else answer = "invalid command";
            return answer;
        }

        private String firstNumber() {
            return String.valueOf(user.firstNumber);
        }

        private String secondNumber() {
            return String.valueOf(user.secondNumber);

        }

        private String saveAsFirstValue() {
            user.firstNumber = lastValue;
            return "saved successfully";
        }

        private String saveAsSecondValue() {
            user.secondNumber = lastValue;
            return "saved successfully";
        }

        private String add(String input) {
            String[] data = input.split(" ");
            lastValue = calculator.add(Double.parseDouble(data[1]), Double.parseDouble(data[2]));
            return String.valueOf(lastValue);
        }

        private String subtract(String input) {
            String[] data = input.split(" ");
            lastValue = calculator.subtract(Double.parseDouble(data[1]), Double.parseDouble(data[2]));
            return String.valueOf(lastValue);
        }

        private String multiply(String input) {
            String[] data = input.split(" ");
            lastValue = calculator.multiply(Double.parseDouble(data[1]), Double.parseDouble(data[2]));
            return String.valueOf(lastValue);
        }

        private String divide(String input) {
            String[] data = input.split(" ");
            lastValue = calculator.divide(Double.parseDouble(data[1]), Double.parseDouble(data[2]));
            return String.valueOf(lastValue);
        }

        private String squareRoot(String input) {
            lastValue = calculator.squareRoot(Double.parseDouble(input.split(" ")[2]));
            return String.valueOf(lastValue);
        }

        private String log(String input) {
            lastValue = calculator.log(Double.parseDouble(input.split(" ")[1]));
            return String.valueOf(lastValue);
        }

        private String sin(String input) {
            lastValue = calculator.sin(Double.parseDouble(input.split(" ")[1]));
            return String.valueOf(lastValue);
        }

        private String cos(String input) {
            lastValue = calculator.cos(Double.parseDouble(input.split(" ")[1]));
            return String.valueOf(lastValue);
        }

        private String tan(String input) {
            lastValue = calculator.tan(Double.parseDouble(input.split(" ")[1]));
            return String.valueOf(lastValue);
        }

        private String cot(String input) {
            lastValue = calculator.cot(Double.parseDouble(input.split(" ")[1]));
            return String.valueOf(lastValue);
        }

        private String abstractValue(String input) {
            lastValue = calculator.abstractValue(Double.parseDouble(input.split(" ")[2]));
            return String.valueOf(lastValue);
        }
    }
}
