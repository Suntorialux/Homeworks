import java.util.Scanner;

/**
 * Created by Andrei Egorov on 19.06.2015.
 */
public class Vvod {
    public static void main(String[] args) {
        int n,m,x;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число N");
        n = scan.nextInt();
        System.err.println("Введите число M");
        m =scan.nextInt();
        System.out.print("N=");
        System.out.println(n);
        System.out.print("M=");
        System.out.println(m);
        if (n>m) {
            for(int i=m; i<n+1; i++) {
                if (i%3==0)
                    System.out.println(i);
            }
        }
        else {
            for(int i=n; i<m+1; i++) {
                if(i%3==0)
                    System.out.println(i);
            }
        }
    }
}

