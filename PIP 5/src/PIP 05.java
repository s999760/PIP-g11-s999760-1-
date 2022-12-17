import java.util.Scanner;

class Zadanie1 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int c;
    c = scan.nextInt();
    System.out.println(wyswietl(c));

    }



    public static int wyswietl(int z) {
        for (int i = 0; i < z; i++) {
            System.out.println(i);
        }
        for (int j = 0; j > z; j--) {
            System.out.println(j);
        }
        return z;
    }
}



class Zadanie2 {
    public static void main(String[] args) {

    int x = 0, y = 1;

    System.out.println("Podaj ile liczb");
    Scanner scan = new Scanner(System.in);
    int ileliczb;
    ileliczb = scan.nextInt();

    int i = 1;

    while (i<ileliczb)
    {
        System.out.println(x + " ");
        int sumapoprzednichliczb = x + y;
        x = y;
        y = sumapoprzednichliczb;
        i++;
    }

    }
}



class Zadanie3 {
    public static void main(String[] args) {

        System.out.println("Wpisz liczbe");

        Scanner scan = new Scanner(System.in);
        int k;
        k = scan.nextInt();

        if (k % 2 == 0) {
            k = k - 1;
        }

        int l = 1;
        int m = 0;
        int n = 1;

        do {
            do {
                System.out.print("*");
                m++;
            } while (m<n);
        System.out.println();
        m = 0;
        n++;
        l++;
        } while (l<=k);

    }
}



class Zadanie4 {
    public static void main(String[] args) {

        int x = 5;
        int y = 3;
        int z = 8;

    System.out.println(pierwszywzor(x) + " " + drugiwzor(y) + " " + trzeciwzor(z));

    }


    public static Object pierwszywzor(int q) {

        for (int i = 0; i < q; i++) {
            System.out.println("*");
        }

        return "";
    }

    public static Object drugiwzor(int e) {

        for (int i = 0; i < e; i++) {
            System.out.println("*");
        }

        return "";
    }


    public static Object trzeciwzor(int f) {

        for (int i = 0; i < f; i++) {
            System.out.println("*");
        }

        return "";
    }
}