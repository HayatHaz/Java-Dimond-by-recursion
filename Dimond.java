
package dimond;

public class Dimond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=5;
        int k=n;
        drawDiamond(n,k,false);
    }
     public static void drawDiamond(int n, int k, boolean f) {//2nd method

        if (k != 0 && n != 0) {//base case
            if (!f) {//flag for the upper part
                drawDiamond(n, k - 1, false);//recall the method for the upper part with decreasing k by one ( closer to base case)
                if (k % 2 == 1) {//printing odd NO. only
                    spaces(n - k);//calculate the spaces using saved orignal value of k in n

                    for (int i = 1; i <= k; i++) {//for loop to print single line stars

                        System.out.print("* ");

                    }
                   System.out.println();
                }
                if (n == k) {//condition to go through the lower part
                    f = true;
                }
            }

            if (f) {//flag for the lower part

                if (k % 2 == 1) {//printing odd NO. only
                    spaces(n - k + 2);//calculate the spaces

                    for (int i = (k - 2); i > 0; i--) {//for loop to print single line stars
                       System.out.print("* ");

                    }
                    System.out.println();
                }
                drawDiamond(n, k - 1, true);//recall the method for the lower part with decreasing k by one ( closer to base case)
            }

        }
    }
      public static void spaces(int n) {
        if (n == 0) {//base case
            return;
        } else {

            System.out.print(" ");//printing empty space to get the shape of the diamond
            spaces(n - 1);//recall with dec. n by one
        }

    }
}
