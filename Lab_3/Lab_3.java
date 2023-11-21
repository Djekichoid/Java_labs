package Lab_3;
import java.util.Scanner;

public class Lab_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;
        String spliter1, spliter2;
        int first_index, second_index;
        System.out.println("Please enter text:");
        text = sc.nextLine();
        System.out.println("Enter separator 1:");
        spliter1 = sc.nextLine();
        System.out.println("Enter separator 2:");
        spliter2 = sc.nextLine();
        String[] sentences = text.split("(?<=([.?!]))\s");
        for (String sentence : sentences) {
            first_index = sentence.indexOf(spliter1);
            second_index = sentence.lastIndexOf(spliter2);
            if (first_index == -1 || second_index == -1 || first_index > second_index) {
                System.out.println(sentence);
            } else {
                sentence = sentence.replace(sentence.substring(first_index, second_index + 1), "");
                System.out.println(sentence);
            }
        }
    }
}
