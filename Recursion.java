public class Recursion {

    public static int recursionSum(int n){
        if(n>0) {
            return n + recursionSum(n-1);
        } else {
            return 0;
        }
    }
    /*
    OR EVEN:
        public static int recursionSum(int n) {
            return n>0? n+recursionSum(n-1) : 0;
        }
        --> We use what is called: ternary operator [POLISH: operator trójargumentowy]
     */

    public static int iterationSum(int n) {
        int sum = 0;
        while(n > 0) {
            sum = sum+n;
            n--;
        }
        return sum;
    }
}

/*
Here is the description of the above recursive method work with argument n=3:

recursionSum(3);

3 + recursionSum(2);

recursionSum(2);

3 + 2 + recursionSum(1);

recursionSum(1);

3 + 2 + 1 + recursionSum(0);

recursionSum(0);

3 + 2 + 1 + 0

recursionSum(1);

3 + 2 + 1

recursionSum(2);

3 + 3

recursionSum(3);

return 6

Here is where we can clearly see the difference between using Recursion and Iteration. Every next value
is landing on the Stack and then these values are being summarized from the end to the beginning of the 'array'. 
Actually, at the end we do not receive:
3 + 2 + 1 + 0 = 6
but
0 + 1 + 2 + 3 = 6

*
*
*

Collection of important info:

1) Recursion calls might create the shape of a "Tree", and every next call lands on the Stack. This is where Recursion
appears to be very "memory-consuming". Recursive operations might also take much more time while working
on large numbers.

2) Recursion might be used in some specific tasks or certain Algorithms (for example: Quick Sort)

3) Every Recursive method might be re-written using Iteration

4) WARNING: Carelessly written Recursion might create an endless loop

 */
