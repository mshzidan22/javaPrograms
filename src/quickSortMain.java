/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MshzidanPC
 */
public class quickSortMain {
    public static void main(String[] args) {
        int a[]={9,2,7,15,5,1,5,4,3,8};
        
        quickSort s1 = new quickSort();
        int right = 0;
        int left = 9;
        s1.quickSort(a, right, left);
        
        for(int i = 0 ; i<9;i++)
        System.out.println(a[i]);
    }
}
