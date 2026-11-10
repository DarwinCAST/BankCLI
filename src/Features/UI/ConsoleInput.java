package Features.UI;

import Features.Models.Users;

import java.util.Scanner;

public class ConsoleInput {
    static Scanner scanner = new Scanner(System.in);

    public static Users enterUserData(){
        System.out.println("Digite su nombre");
        String name = scanner.nextLine();

        System.out.println("Digite su email");
        String email = scanner.nextLine();

        System.out.println("Digite su identificacion");
        String userID = scanner.nextLine();

        System.out.println("Digite su password");
        String password = scanner.nextLine();

        return new Users(name, email, userID, password);
    }


}
