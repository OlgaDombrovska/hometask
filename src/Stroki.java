import java.util.Scanner;

public class Stroki {
    public static void main(String[] args) {


        String bukva = new String();
        Scanner input = new Scanner(System.in);
        bukva = input.nextLine();
        String bukva1 = bukva.toLowerCase();
        System.out.println(bukva1.replaceAll("[aeyiou]", "").replaceAll(".", ".$0"));
    }
}

