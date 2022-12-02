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
        Scanner scan = new Scanner(System.in);
        int liczba1, liczba2, wybor;
        System.out.println("Wprowadz pierwsza liczbe");
        liczba1 = scan.nextInt();
        System.out.println("Wprowadz druga liczbe");
        liczba2 = scan.nextInt();

        System.out.println("Wybierz dzialanie");
        System.out.println("1: suma");
        System.out.println("2: roznica");
        System.out.println("3: mnozenie");
        System.out.println("4: dzielenie");
        wybor = scan.nextInt();

        switch (wybor){
            case 1:
                add(liczba1, liczba2);
                System.out.println(add(liczba1, liczba2));
            break;
            case 2:
                sub(liczba1, liczba2);
                System.out.println(sub(liczba1, liczba2));
            break;
            case 3:
                mul(liczba1, liczba2);
                System.out.println(mul(liczba1, liczba2));
            break;
            case 4:
                div(liczba1, liczba2);
                System.out.println(div(liczba1, liczba2));
            break;
        }
    }

    public static int add(int x, int y) {
        int wynik = x + y;
        return wynik;
    }

    public static int sub(int x, int y) {
        int wynik = x - y;
        return wynik;
    }

    public static int mul(int x, int y) {
        int wynik = x * y;
        return wynik;
    }

    public static int div(int x, int y) {
        int wynik = x / y;
        return wynik;
    }
}
