import java.util.Scanner;

class zadanie1 {
    public static void main(String[] args) {
        boolean CzyPada = true;
        boolean CzySwieciSlonce = true;

        if (CzyPada && !CzySwieciSlonce) {
            System.out.println("plucha");
        } else if (CzyPada && CzySwieciSlonce) {
            System.out.println("tecza");
        } else if (!CzyPada && CzySwieciSlonce) {
            System.out.println("slonecznie");
        } else if (!CzyPada && !CzySwieciSlonce){
            System.out.println("pochmurno");
        }
    }
}

class zadanie4 {
    public static void main(String[] args) {
        numbers();

        }

    public static void numbers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz pierwsza wartosc");
        int wartosc1 = scan.nextInt();
        System.out.println("Wprowadz druga wartosc");
        int wartosc2 = scan.nextInt();
    }

}