//BubbleSort
public class bubbleSort {

    public static void main(String[] args) {
        int a[]={4,16,9,8,1,3};
        int j,i,temp;
        boolean flag=true;
        for(j=5;j>0;j--)
        
        {
        for(i=0;i<j;i++)
        {
        flag=false;
            if(a[i]>a[i+1]){
        
        temp=a[i];
        a[i]=a[i+1];
        a[i+1]=temp;
        flag =true;
        }
        
        }
        if(!flag){
        break;
        }
        }
        for(int m =0;m<6;m++)
        System.out.println(a[m]);
        
    }
    
}