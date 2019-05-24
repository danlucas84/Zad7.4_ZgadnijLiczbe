import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int minValue = 100;

        int maxValue = 200;

        System.out.println("Podaj liczbe z przedzialu 100 a 200 ktora jest podzielna przez 3");


        int userChoice = input.nextInt();

        if (userChoice < minValue) {
            System.out.println("liczba za mała");
            System.out.println("Podaj ponownie liczbe");
            userChoice = input.nextInt();
            if (userChoice > maxValue) {
                System.out.println("liczba za duza");
                System.out.println("Podaj ponownie liczbe");
                userChoice = input.nextInt();
                if (userChoice >= minValue && userChoice <= maxValue && userChoice % 3 == 0) {
                    System.out.println("liczba w przedziale i jest podzielna przez 3");


                    while (!(userChoice >= minValue && userChoice <= maxValue && userChoice % 3 == 0))
                        System.out.println("Liczba nie  spełnia warunku");
                    System.out.println("Podaj ponownie liczbe");
                    userChoice = input.nextInt();
                    userChoice++;
                    //if (!(userChoice >= minValue && userChoice <= maxValue && userChoice % 3 == 0))
                    //input.close();
                    //else {
                    //System.out.println("Podaj ponownie liczbe");
                    //userChoice = input.nextInt();
                    //System.out.println("liczba nie spełnia warunek nie jest z przedziału i jest podzielna przez 3");
                }
            }
        }
    }
}




