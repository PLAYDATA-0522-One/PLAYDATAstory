package town;

import java.util.Scanner;

public class Town {
        Town town = new Town();
        // town.run();

    public void run() {
        enterShop();
        enterTemple();
    }

    private void enterShop() {
        Scanner sc = new Scanner(System.in);
        System.out.println("PlayData 상점입니다! 어서오세요^^");
        System.out.println("1.구매 2. 나가기");

        String mode = sc.nextLine();

        if (mode == "1") {
            buyItem();
        } else if (mode == "2") {
            System.out.println("상점에서 나갑니다.");
        } else {
            System.out.println("잘못된 입력입니다.");
        }

        sc.close();
    }

    private void buyItem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("어떤 아이템을 구매하시겠습니까?");
        String item = sc.nextLine();

        // 아이템 구매 로직
        System.out.println(item + "을(를) 구매하셨습니다!");

        sc.close();
    }

    private void enterTemple() {
        Scanner sc = new Scanner(System.in);

        System.out.println("PlayData 신전입니다! 어서오세요^^");
        System.out.println("1.회복 2. 나가기");

        int mode = Integer.parseInt(sc.nextLine());

        if (mode == 1) {
            recovery();
        } else if (mode == 2) {
            System.out.println("신전에서 나갑니다.");
        } else {
            System.out.println("잘못된 입력입니다.");
        }

        sc.close();
    }

    private void recovery() {
        System.out.println("체력을 회복합니다.");
    }
}