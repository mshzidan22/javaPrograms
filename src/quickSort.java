
import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MshzidanPC
 */
public class quickSort {
    
public void quickSort(int a [] , int p , int r){
       if (p < r)
        {
        
        partition c1 = new partition();
        quickSort c2 = new quickSort();
        int q ;
        q = c1.partition(a, p, r);
         System.out.println(a[p]);
        c2.quickSort(a, p, q-1);
        c2.quickSort(a,q+1,r);
        
        
        }
          
    }
    
}
