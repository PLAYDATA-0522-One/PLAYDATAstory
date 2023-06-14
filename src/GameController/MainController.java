
package GameController;
import java.util.Scanner;
public class MainController {
    private static Scanner sc;
    public static void selectMenu() {
        sc = new Scanner(System.in);
        displayMenu();
        processUserInput();
    }
    private static void displayMenu() {
        System.out.println("1. 게임시작 2. 게임종료");
    }
    private static void processUserInput() {
        String mode = sc.nextLine();
        switch (mode) {
            case "1" :
                new CharacterController(sc).selectjob();
                selectMenu();
                break;
            case "2" :
                break;
        }
    }
}