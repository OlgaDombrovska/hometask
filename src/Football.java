import java.util.Scanner;

public class Football {
    public static void main(String[] args) {


        String gamer = new String();
        Scanner input = new Scanner(System.in);
        gamer = input.nextLine();

        if (gamer.contains("0000000") || gamer.contains("1111111")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}