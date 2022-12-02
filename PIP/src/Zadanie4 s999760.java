import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

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
        int liczba1, liczba2, wybor, wynik, wynik2;
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
                wynik = add(liczba1, liczba2);
                wynik2 = AbsoluteValue(wynik);
                System.out.println("Wynik:" + " " + wynik);
                System.out.println("Wartosc bezwzgledna:" + " " + wynik2);
            break;
            case 2:
                wynik = sub(liczba1, liczba2);
                wynik2 = AbsoluteValue(wynik);
                System.out.println("Wynik:" + " " + wynik);
                System.out.println("Wartosc bezwzgledna:" + " " + wynik2);
            break;
            case 3:
                wynik = mul(liczba1, liczba2);
                wynik2 = AbsoluteValue(wynik);
                System.out.println("Wynik:" + " " + wynik);
                System.out.println("Wartosc bezwzgledna:" + " " + wynik2);
            break;
            case 4:
                wynik = div(liczba1, liczba2);
                wynik2 = AbsoluteValue(wynik);
                System.out.println("Wynik:" + " " + wynik);
                System.out.println("Wartosc bezwzgledna:" + " " + wynik2);
            break;
            default:
                System.out.println("Brak takiego dzialania");
        }
    }

    public static int add(int x, int y) {
        int suma = x + y;
        return suma;
    }

    public static int sub(int x, int y) {
        int roznica = x - y;
        return roznica;
    }

    public static int mul(int x, int y) {
        int iloczyn = x * y;
        return iloczyn;
    }

    public static int div(int x, int y) {
        int iloraz = x / y;
        return iloraz;
    }

    public static int AbsoluteValue(int z) {
        int wartoscbezwzgledna = Math.abs(z);
        return wartoscbezwzgledna;

    }
}

class zadanie6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b;
        System.out.println("Wprowadz pierwsza liczbe");
        a = scan.nextDouble();
        System.out.println("Wprowadz druga liczbe");
        b = scan.nextDouble();

        if (a > b) {
            double c = a;
            a = b;
            b = c;
            System.out.println(a);
            System.out.println(b);

        }

        System.out.println("Wybrany przedzial" + " [" + a + ", " + b + "]");

        System.out.println("Wartosci generowane losowo");
        Random random = new Random();
        double random1 = Math.random() * (a - b) + b;
        double random2 = Math.random() * (a - b) + b;
        double random3 = Math.random() * (a - b) + b;


        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);

        double miejsce1, miejsce2, miejsce3;

        if (random1 < random2) {
            miejsce1 = random1;
            miejsce2 = random2;
        } else {
            miejsce1 = random2;
            miejsce2 = random1;
        }

        if (random3 < miejsce1) {
            miejsce3 = miejsce2;
            miejsce2 = miejsce1;
            miejsce1 = random3;
        } else if (random3 < miejsce2) {
            miejsce3 = miejsce2;
            miejsce2 = random3;
        } else {
            miejsce3 = random3;
        }

        System.out.println("Gdzie: " + miejsce1 + " < " + miejsce2 + " < " + miejsce3);

    }

}

class zadanie8 {

    public static void main(String[] args){

        System.out.println("Witamy w kantorze!");

        Scanner scan = new Scanner(System.in);
        int waluta;
        System.out.println("Wybierz walute");
        System.out.println("1 - PLN");
        System.out.println("2 - JPY");
        waluta = scan.nextInt();

        while (waluta != 1 && waluta != 2){
            System.out.println("Wybierz PLN albo JPY");
            waluta = scan.nextInt();
        }

        System.out.println("Wprowadz kwote");
        int kwota;
        kwota = scan.nextInt();
        double kurs = 30.24;

        if (waluta == 1){
           System.out.println(kwota * kurs);
        }

        if (waluta == 2){
            System.out.println(kwota / kurs);
        }

    }
}