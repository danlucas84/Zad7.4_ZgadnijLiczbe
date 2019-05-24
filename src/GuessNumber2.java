import java.util.Scanner;

public class GuessNumber2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int minValue = 100;

        int maxValue = 200;

        int guessNumber;

        System.out.println("Podaj liczbe z przedzialu 100 a 200 ktora jest podzielna przez 3");

        int userChoice = input.nextInt();
        while ((userChoice >= minValue && userChoice <= maxValue && userChoice % 3 == 0)) {
            System.out.println("Liczba spełnia warunek");
            System.out.println("Podaj ponownie liczbe");
            userChoice = input.nextInt();
            //userChoice++;
            if ((userChoice > minValue && userChoice < maxValue) || (userChoice % 3 == 1)) {
                System.out.println("liczba  w zakresie  ale nie jest podzielna przez 3");
                System.out.println("Podaj ponownie liczbe");
                userChoice = input.nextInt();
            }

                if (userChoice < minValue) {
                    System.out.println("liczba za mała");
                    System.out.println("Podaj ponownie liczbe");
                    userChoice = input.nextInt();
                    if (userChoice > maxValue) {
                        System.out.println("liczba za duza");
                        System.out.println("Podaj ponownie liczbe");
                        userChoice = input.nextInt();
                    }
                }
            }
        }
    }

