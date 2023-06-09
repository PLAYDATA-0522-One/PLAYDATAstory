package town;

import java.util.Scanner;

import static Global.Manager.human;


public class Town {


        Town town = new Town();
        town.run();

    public void run() {
        Shop shop = new Shop();
        Temple temple = new Temple();

        shop.enterShop();
        temple.enterTemple();
    }

    class Shop {
        public void enterShop() {
            Scanner sc = new Scanner(System.in);
            System.out.println("PlayData 상점입니다! 어서오세요^^");
            System.out.println("1.구매 2. 나가기");

            int mode = Integer.parseInt(sc.nextLine());
            buy(mode);

            sc.close();
        }

        private void buy(int mode) {
            if (mode == 1) {
                Scanner sc = new Scanner(System.in);
                System.out.println("어떤 아이템을 구매하시겠습니까?");
                String item = sc.nextLine();

                System.out.println(item + "을(를) 구매하셨습니다!");

                sc.close();
            } else if (mode == 2) {
                System.out.println("상점에서 나갑니다.");
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }

    public class Temple {
        public void enterTemple() {
            Scanner sc = new Scanner(System.in);

            System.out.println("PlayData 신전입니다! 어서오세요^^");
            System.out.println("1.회복 2. 나가기");

            int mode = Integer.parseInt(sc.nextLine());

            recovery(mode);

            sc.close();
        }
        private void recovery(int mode){
            if (mode == 1) {
                System.out.println("체력을 회복합니다.");
            } else if (mode == 2) {
                System.out.println("신전에서 나갑니다.");
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}

