/*
 * Outputs the minimum value in the given array of number
 */
package searchmin;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;
public class SearchMin {
    public static void main (String args[]){
        int[] number = {1, 3, 5, 4, 2};
        int c;
        c = minimumval (number);
        System.out.println("Minimum Value: " + c);
    }
    public static int minimumval (int n []){
        int i, x = n[0];
        for (i=0; i<5; i++){
            if (n[i]<x)
                x = n[i];            
        }
        return(x);
    }
}