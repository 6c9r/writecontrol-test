import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<User> users = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Gestionnaire d'utilisateurs");

        while (true) {
            afficherMenu();
            int choix = scanner.nextInt();
            scanner.nextLine(); // vider le buffer

            switch (choix) {
                case 1:
                    ajouterUser();
                    break;
                case 2:
                    afficherUsers();
                    break;
                case 3:
                    System.out.println("Au revoir!");
                    return;
                default:
                    System.out.println("Choix invalide");
            }
        }
    }

    private static void afficherMenu() {
        System.out.println("\n1. Ajouter un user");
        System.out.println("2. Voir tous les users");
        System.out.println("3. Quitter");
        System.out.print("Choix: ");
    }

    private static void ajouterUser() {
        System.out.print("Nom: ");
        String nom = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // vider le buffer

        users.add(new User(nom, email, age));
        System.out.println("User ajouté!");
    }

    private static void afficherUsers() {
        if (users.isEmpty()) {
            System.out.println("Aucun user");
        } else {
            for (User user : users) {
                System.out.println(user);
            }
        }
    }
}
