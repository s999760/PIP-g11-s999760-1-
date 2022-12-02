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

