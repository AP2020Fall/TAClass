import java.util.HashMap;
import java.util.Scanner;

public class Gym {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        HashMap<String, String> exercises = new HashMap<>();

        while (!(input = scanner.nextLine()).equalsIgnoreCase("end")) {
            if (!input.matches("\\S+\\s*->\\s*\\d+:\\d+")) {
                System.out.println("Your input is invalid!");
            } else {
                int index = input.indexOf("->");
                String exerciseName = input.substring(0, index);
                String sets = input.substring(index + 2);
                exercises.put(exerciseName.trim(), sets.trim());
            }
        }

        printChart(exercises);
    }

    private static void printChart(HashMap<String, String> exercises) {

        System.out.print("Exercise");
        for (int i = 0; i < 12; i++) {
            System.out.print(" ");
        }
        System.out.println("Sets Reps Total");

        int counter = 1;
        for (String s : exercises.keySet()) {
            System.out.println();
            System.out.print(counter + ". " + s);
            spaceProvider(s, 17);
            int set = Integer.parseInt(exercises.get(s).split(":")[0]);
            int rep = Integer.parseInt(exercises.get(s).split(":")[1]);
            int total = rep * set;
            System.out.print(set);
            spaceProvider(Integer.toString(set), 5);
            System.out.print(rep);
            spaceProvider(Integer.toString(rep), 5);
            System.out.print(total);
            counter++;
        }
    }

    private static void spaceProvider(String input, int spaces) {
        for (int i = 0; i < spaces - input.length(); i++) {
            System.out.print(" ");
        }
    }
}