package kg.itacademy.fv21;

public class Main {

    public static void main(String[] args) {
        Kopilka myKopilka = new Kopilka();
        myKopilka.insertMoney(10);
        myKopilka.insertMoney(2);
        myKopilka.insertMoney(9);

        Kopilka mySecondKopilca = new Kopilka();
        mySecondKopilca.insertMoney(23);

        Kopilka my3Kopilca = new Kopilka();
//        myKopilka.countMoney = 123;

        System.out.println("Первая копилка " + myKopilka.countMoney);
        System.out.println("Вторая копилка " + mySecondKopilca.countMoney);
        System.out.println("3 копилка " + my3Kopilca.countMoney);
    }
}
