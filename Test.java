import java.util.Scanner;

public class Test {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        String name;
        System.out.print("Podaj imie: ");
        name = scanner.nextLine();
        System.out.print("Hello "+ name);
    }
}