public class StringExample {
    public static void main(String[] args) {
        StringBuilder sentence = new StringBuilder("No Corona vaccine since October");
        System.out.println(sentence);
        sentence.delete(0, sentence.indexOf("Corona"));
        sentence.replace(sentence.indexOf("since"), sentence.length(), "has been made");
        System.out.println(sentence);
    }
}