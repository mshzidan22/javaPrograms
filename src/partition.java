/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MshzidanPC
 */
public class partition {

   public int partition (int a[],int p ,int r)
    {
    int i , j , pivot, temp;
    pivot=a[p];
    i=p;
    j=r;
    while(true){
    while(a[i] < pivot && a[i] != pivot)
    i++;
   while(a[j]>pivot && a[j]!=pivot)
       j--;
   if(i<j)
   {
   temp=a[i];
   a[i]=a[j];
   a[j]=temp;
   }
   else
       return i;
   
    }  
    }
}
    

