import java.util.Scanner;

public class Main {
    String Login;
    String password;
    static double balance=1000;
    double deposite;
    static int summ;

    static Scanner scan=new Scanner(System.in);



    public static void deposit(){//депозит кошот
        System.out.println("Сколько вы хотите добовлять? ");
        double depositte=scan.nextDouble();
        int summ=(int)(depositte+balance);
        System.out.println("Ваш баланс пополнен на "+depositte+" ваш счет теперь "+balance+" сом");
    }
    public static void withdrawal(){// алат
        System.out.println("Сколько вывести? ");
        double with= scan.nextDouble();
      balance =  balance- with;
        System.out.println("Вы вывели "+with+" у вас осталось "+balance+" сом");}

    public static void main(String[] args) {
        deposit();
        withdrawal();

    }}