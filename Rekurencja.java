public class Rekurencja {

    public static int sumaRekurencyjna(int n){
        if(n>0) {
            return n + sumaRekurencyjna(n-1);
        } else {
            return 0;
        }
    }
    /*
    LUB NAWET:
        public static int sumaRekurencja(int n) {
            return n>0? n+sumaRekurencja(n-1) : 0;
        }
        --> Uźycie tzw: operatora trójargumentowego (ternary operator)
     */

    public static int sumaIteracja(int n) {
        int suma = 0;
        while(n > 0) {
            suma = suma+n;
            n--;
        }
        return suma;
    }
}

/*
Opisowy sposób działania powyższej metody rekurencyjnej przy argumencie n=3:

sumaRekurencja(3);

3 + sumaRekurencja(2);

sumaRekurencja(2);

3 + 2 + sumaRekurencja(1);

sumaRekurencja(1);

3 + 2 + 1 + sumaRekurencja(0);

sumaRekurencja(0);

3 + 2 + 1 + 0

sumaRekurencja(1);

3 + 2 + 1

sumaRekurencja(2);

3 + 3

sumaRekurencja(3);

return 6

Widać dokładnie różnicę, pomiędzy użyciem standardowej Iteracji oraz Rekurencji. Kolejne wartości wywołań
są odkładane na Stosie i następnie sumowane od końca. W gruncie rzeczy nie otrzymujemy działania:
3 + 2 + 1 + 0 = 6
ale
0 + 1 + 2 + 3 = 6

*
*
*

Zbiór ważnych informacji:

1) Rekurencja może przyjąć strukturę "drzewa", a każde kolejne wywołanie jest odkładane na stosie. Stąd może być
niezwykle "pamięciożerna" oraz wykonywać się bardzo długo dla dużych liczb

2) Używana jest w niektórych specyficznych warunkchac oraz Algorytmach (np.: Quick Sort)

3) Każdą metodę opisaną Rekurencyjnie można przepisać z użyciem Iteracji

4) Należy uważać, aby nie zapętlić metody Rekurencyjnej w nieskończoność

 */
