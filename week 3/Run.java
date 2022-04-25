import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {
    private THY thy = THY.createTHY();
    private Pegasus p = Pegasus.createpegasus();
    private Scanner sc = new Scanner(System.in);
    private Ticket t = null;
    private int select;
    private boolean isAboard;
    private boolean isBussiness;

    public Run() {
        while(menu()){

        }
    }

    private boolean menu() {
        System.out.println("Hava limanına hoş geldiniz, bilet almak istediğiniz hava yolunu seçiniz.");
        System.out.println("[1] THY");
        System.out.println("[2] Pegasus");
        System.out.println("Çıkış yapmak için herhangi bir sayıya basınız.");

        switch (select()) {
            case 1:
                this.t = new Ticket(thy);
                break;
            case 2:
                t = new Ticket(p);
                break;
            default:
                System.out.println("Çıkış yaptınız, iyi günler dileriz.");
                return false;
        }
        getData();
        System.out.println("Başka bir işlem yapmak ister misiniz?");
        System.out.println("[1]Evet");
        System.out.println("[2]Hayır");
        switch (select()) {
            case 1:
                return true;
            case 2:
                return false;
            default:
                return false;
        }

    }

    private int select() {
        while (true) {
            try {
                select = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Hatalı giriş yaptınız lütfen tekrar deneyin.");
                sc.next();
            }
        }

        return select;
    }

    private void getData() {
        System.out.println("Yurtiçi ya da Yurt dışı seçeneğini işaretleyiniz");
        System.out.println("[1]Yurtiçi");
        System.out.println("[2]Yurtdışı");
        switch (select()) {
            case 1:
                isAboard = false;
                break;
            case 2:
                isAboard = true;
                break;
            default:
                break;
        }
        System.out.println("Kaç bilet alacaksınız?");
        int passengerCount = sc.nextInt();
        System.out.println("Bussiness bilet almak ister misiniz?");
        System.out.println("[1]Evet");
        System.out.println("[2]Hayır");
        switch (select()) {
            case 1:
                isBussiness = true;
                break;
            case 2:
                isBussiness = false;
                break;
            default:
                break;
        }
        t.buyTicket(passengerCount, isAboard, isBussiness);

    }
}
