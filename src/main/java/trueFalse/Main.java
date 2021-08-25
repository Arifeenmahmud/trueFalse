/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trueFalse;

/**
 *
 * @author Arifeen Mahmud
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean ans;
        ans = 5 > 10;
        System.out.println(ans);
        ans = 5 < 10;
        System.out.println(ans);

        ans = 5 == 10;
        System.out.println(ans);

        ans = 5 != 10;
        System.out.println(ans);
        ans = 5 >= 10;
        System.out.println(ans);
        ans = 5 <= 10;
        System.out.println(ans);

        int n1=14, n2=30;
        int anS = (n1<n2)?n1+n2:n2*n1;


        int x=3;
        int Ans = ++x + --x; //* x;

        System.out.println("Answer:"+Ans);
    }
    
}
